package project.weather_data_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // ignore unused fields
public class WeatherAPIResponseDTO {

	@JsonProperty("current_weather")
	private WeatherResponseDTO currentWeather;

	//	getter
	public WeatherResponseDTO getCurrentWeather() {
		return currentWeather;
	}

	//	setter
	public void setCurrentWeather(WeatherResponseDTO currentWeather) {
		this.currentWeather = currentWeather;
	}
}
