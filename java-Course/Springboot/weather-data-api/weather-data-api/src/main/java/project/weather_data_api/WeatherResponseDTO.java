package project.weather_data_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // ignore unused fields
public class WeatherResponseDTO {

	@JsonProperty("temperature")
	private double temperature;

	@JsonProperty("windspeed")
	private double windspeed;

	@JsonProperty("weathercode")
	private int weathercode;

	@JsonProperty("time")
	private String time;

	private String weatherDescription;
	private String weatherIcon;

	// getter
	public double getTemperature() {
		return temperature;
	}

	// setter
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	// getter
	public double getWindspeed() {
		return windspeed;
	}

	// setter
	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}

	// getter
	public int getWeathercode() {
		return weathercode;
	}

	// setter
	public void setWeathercode(int weathercode) {
		this.weathercode = weathercode;
	}

	// getter
	public String getTime() {
		return time;
	}

	// setter
	public void setTime(String time) {
		this.time = time;
	}

	// getter
	public String getWeatherDescription() {
		return weatherDescription;
	}

	// setter
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}

	// getter
	public String getWeatherIcon() {
		return weatherIcon;
	}

	// setter
	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}
}
