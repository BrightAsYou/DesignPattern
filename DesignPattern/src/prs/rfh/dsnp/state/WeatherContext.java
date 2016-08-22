package prs.rfh.dsnp.state;

public class WeatherContext {
	IWeather iw ;
	
	public void setWeather(IWeather weather){
		this.iw= weather;
	}
	
	public String getWeather(){
		return iw.getWeather();
	}
	
	public String getWeatherMessage(){
		return iw.getWeather();
	}
	
}
