package jp.w3ch.examples;

import com.typesafe.config.*;

public class MyApp3 {

	public static void main(String[] args) {
		Config config = ConfigFactory.load("myapp3/application");

		System.out.println("fileSize: " + config.getBytes("app.fileSize") + " bytes");
		System.out.println(" timeout: " + config.getMilliseconds("app.timeout") + " milliseconds");
	}
}
