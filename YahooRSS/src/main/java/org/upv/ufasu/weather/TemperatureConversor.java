package org.upv.ufasu.weather;

public class TemperatureConversor {

	public static String F2C(String Faren) {
		int i = Integer.parseInt(Faren);
		int f = (int) Math.round((i - 32)/1.8);
		return Integer.toString(f);		
	}
}
