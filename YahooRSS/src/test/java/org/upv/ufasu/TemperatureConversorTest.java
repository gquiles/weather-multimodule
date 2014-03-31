package org.upv.ufasu;

import java.io.InputStream;

import org.upv.ufasu.weather.TemperatureConversor;
import org.upv.ufasu.weather.Weather;
import org.upv.ufasu.weather.YahooParser;

import junit.framework.TestCase;

public class TemperatureConversorTest extends TestCase {

	   /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TemperatureConversorTest( String testName )
    {
        super( testName );
    }

    public void testParser() 
    {
		assertEquals( TemperatureConversor.F2C("50"), "10" );
    }
}
