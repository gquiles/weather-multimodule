package org.upv.ufasu;

import java.io.InputStream;

import org.upv.ufasu.weather.Weather;
import org.upv.ufasu.weather.YahooParser;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class YahooParseTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public YahooParseTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( YahooParseTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws Exception 
     */
    public void testParser() throws Exception
    {
    	InputStream valenciaData =
    			getClass().getClassLoader().getResourceAsStream("tiempo_valencia.xml");
		Weather weather = new YahooParser().parse( valenciaData );
		assertEquals( "Valencia", weather.getCity() );
		assertEquals( "SP", weather.getCountry() );
		assertEquals( "70", weather.getTemp() );
		assertEquals( "Fair", weather.getCondition() );
		assertEquals( "70", weather.getChill() );
		assertEquals( "21", weather.getHumidity() );
    }
}
