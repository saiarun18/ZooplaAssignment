package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class My_1st_Appium {
	
	static AppiumDriver driver;
	

	public static void main(String[] args) {
		
		try {
			opencalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void opencalculator() throws Exception
	{
	
		DesiredCapabilities dac=new DesiredCapabilities();
		
		dac.setCapability("deviceName","Realme 1");
		dac.setCapability("udid","WG456HHIZLA66DQS");
		dac.setCapability("platformName","Android");
		dac.setCapability("platformVersion","9");
		dac.setCapability("appPackage","com.android.calculator2");
        dac.setCapability("appActivity","com.android.calculator2.Calculator");
        
        
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver =new AppiumDriver<MobileElement>(url,dac);
        
          
	}
}
