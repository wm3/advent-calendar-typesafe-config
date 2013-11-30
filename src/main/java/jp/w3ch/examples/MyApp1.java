package jp.w3ch.examples;

import com.typesafe.config.*;

public class MyApp1 {

	public static void main(String[] args) {
		Config config = ConfigFactory.load("myapp1/hello");

		System.out.println("Hello " + config.getString("app.message") + "!");
	}
}
