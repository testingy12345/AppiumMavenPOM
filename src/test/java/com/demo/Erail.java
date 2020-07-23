package com.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Erail {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "10");
		capabilities.setCapability("deviceName","4b0a203b");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "in.erail.m");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity","in.erail.m.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
		//Create RemoteWebDriver instance and connect to the Appium server
		//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	@Test
	public void eRailLaunch() {
		System.out.println("Application is Launch ");
		//Train Xpath  driver.findElement(By.xpath("")).click();
		//  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView[1]/android.view.View[1]/android.view.View")).click();
		//Train Xpath
		// driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView[1]/android.view.View[1]/android.view.View")).click();

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView[1]/android.view.View[1]/android.view.View\n")).click();
		// driver.findElement(By.xpath("//[contains(text(),'Home')]")).click();

		// driver.findElement(By.id("divRightNavButton")).click();

		// driver.findElement(By.xpath("//*[@elementId='166fd309-e5ac-475d-a165-fa26090e7495']")).click();

		// driver.findElement(By.id("txtTrainNo")).sendKeys("12001");

		driver.findElement(By.xpath("//*[@resource-id='txtTrainNo']")).clear();
		driver.findElement(By.xpath("//*[@resource-id='txtTrainNo']")).sendKeys("12001"); 
	}
	@AfterMethod
	public void afterMethod() {

	}

}
