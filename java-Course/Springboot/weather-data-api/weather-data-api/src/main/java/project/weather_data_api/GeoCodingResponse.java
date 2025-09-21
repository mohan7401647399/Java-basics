package project.weather_data_api;

import java.util.List;

import lombok.Data;

@Data
public class GeoCodingResponse {

	private List<Location> results;

	@Data
	public static class Location {

		private double latitude;
		private double longitude;

		// getter
		public double getLatitude() {
			return latitude;
		}

		//	setter
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}

		// getter
		public double getLongitude() {
			return longitude;
		}

		// setter
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
	}
	
	//	getter
	public List<Location> getResults() {
		return results;
	}

	//	setter
	public void setResults(List<Location> results) {
		this.results = results;
	}
}
