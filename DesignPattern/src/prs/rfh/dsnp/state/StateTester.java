package prs.rfh.dsnp.state;

public class StateTester {
	
	public static void main(String[] args) {
		WeatherContext w1 = new WeatherContext();
		w1.setWeather(new SunShine());
		System.out.println(w1.getWeatherMessage());

		
		WeatherContext w2 = new WeatherContext();
		w2.setWeather(new Rain());
		System.out.println(w2.getWeatherMessage());
	}
	
}
