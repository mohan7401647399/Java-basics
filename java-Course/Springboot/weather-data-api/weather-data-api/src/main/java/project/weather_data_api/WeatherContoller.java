package project.weather_data_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherContoller {

	public final WeatherService weatherService;

	//	constructor
	public WeatherContoller(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	@GetMapping
	public WeatherResponseDTO getWeather(@RequestParam String location) {
		return weatherService.getWeather(location);
	}
}
