package project.weather_data_api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	//	get weather data URL
	@Bean
	public WebClient weatherWebClient(WebClient.Builder builder) {
		return builder.baseUrl("https://api.open-meteo.com").build();
	}

	//	get latitude and longitude of location URL
	@Bean
	public WebClient geoWebClient(WebClient.Builder builder) {
		return builder.baseUrl("https://geocoding-api.open-meteo.com").build();
	}
}
