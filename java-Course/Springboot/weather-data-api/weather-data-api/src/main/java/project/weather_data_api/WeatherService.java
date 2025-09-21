package project.weather_data_api;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WeatherService {
	
	private final WebClient weatherWebClient;
	private final WebClient geoWebClient;

	//	constructor
	public WeatherService(WebClient weatherWebClient, WebClient geoWebClient) {
		this.weatherWebClient = weatherWebClient;
		this.geoWebClient = geoWebClient;
	}

	// location name to latitude & longitude
	public GeoCodingResponse.Location getCoOrdinates(String location) {
		GeoCodingResponse response = geoWebClient
				.get().uri(uriBuilder -> uriBuilder.path("/v1/search").queryParam("name", location)
						.queryParam("count", 1).queryParam("language", "en").build())
				.retrieve().bodyToMono(GeoCodingResponse.class).block();

		return (response != null && !response.getResults().isEmpty()) ? response.getResults().get(0) : null;
	}

	// Get weather data using latitude & longitude
	public WeatherResponseDTO getWeather(String location) {

		GeoCodingResponse.Location coOrdinates = getCoOrdinates(location);

		if (coOrdinates == null)
			return null;

		// map JSON to weatherAPIResponse
		WeatherAPIResponseDTO response = weatherWebClient.get()
				.uri(uriBuilder -> uriBuilder.path("/v1/forecast").queryParam("latitude", coOrdinates.getLatitude())
						.queryParam("longitude", coOrdinates.getLongitude()).queryParam("current_weather", "true")
						.build())
				.retrieve().bodyToMono(WeatherAPIResponseDTO.class).block();

		WeatherResponseDTO weatherResponse = response.getCurrentWeather();

		// add description and Emoji
		weatherResponse.setWeatherDescription(getWeatherDescription(weatherResponse.getWeathercode()));
		weatherResponse.setWeatherIcon(getWeatherIcon(weatherResponse.getWeathercode()));

		return weatherResponse;
	}

	// Map weather code to Description
	private String getWeatherDescription(int code) {
		Map<Integer, String> weatherDescriptions = Map.ofEntries(Map.entry(0, "Clear sky"),
				Map.entry(1, "Mainly clear"), Map.entry(2, "Partly cloudy"), Map.entry(3, "Overcast"),
				Map.entry(45, "Fog"), Map.entry(48, "Depositing rime fog"), Map.entry(51, "Light drizzle"),
				Map.entry(53, "Moderate drizzle"), Map.entry(55, "Heavy drizzle"), Map.entry(56, "Freezing drizzle"),
				Map.entry(57, "Heavy freezing drizzle"), Map.entry(61, "Light rain"), Map.entry(63, "Moderate rain"),
				Map.entry(65, "Heavy rain"), Map.entry(80, "Rain showers"), Map.entry(81, "Heavy rain showers"),
				Map.entry(82, "Violent rain showers"), Map.entry(95, "Thunderstorm"),
				Map.entry(96, "Thunderstorm with hail"), Map.entry(99, "Severe thunderstorm with hail"));
		return weatherDescriptions.getOrDefault(code, "Unknown weather");
	}

	// Map weather code to Description
	private String getWeatherIcon(int code) {
		Map<Integer, String> weatherIcons = Map.ofEntries(Map.entry(0, "☀️"), // Clear sky
				Map.entry(1, "🌤️"), // Mainly clear
				Map.entry(2, "⛅"), // Partly cloudy
				Map.entry(3, "☁️"), // Overcast
				Map.entry(45, "🌫️"), // Fog
				Map.entry(48, "🌁"), // Depositing rime fog
				Map.entry(51, "🌦️"), // Light drizzle
				Map.entry(53, "🌧️"), // Moderate drizzle
				Map.entry(55, "🌧️"), // Heavy drizzle
				Map.entry(56, "🌨️"), // Freezing drizzle
				Map.entry(57, "❄️"), // Heavy freezing drizzle
				Map.entry(61, "🌧️"), // Light rain
				Map.entry(63, "🌧️"), // Moderate rain
				Map.entry(65, "🌧️"), // Heavy rain
				Map.entry(80, "🌦️"), // Rain showers
				Map.entry(81, "🌧️"), // Heavy rain showers
				Map.entry(82, "⛈️"), // Violent rain showers
				Map.entry(95, "🌩️"), // Thunderstorm
				Map.entry(96, "⛈️"), // Thunderstorm with hail
				Map.entry(99, "⛈️")); // Severe thunderstorm with hail
		return weatherIcons.getOrDefault(code, "❓"); // Default icon if code not found
	}
}
