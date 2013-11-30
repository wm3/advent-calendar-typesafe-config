package jp.w3ch.examples;

import com.typesafe.config.*;

public class MyApp2 {

	public static void main(String[] args) {
		Config config = ConfigFactory.load("myapp2/" + args[0]);

		System.out.println("database: " + config.getString("app.db.url"));
		System.out.println("    user: " + config.getString("app.db.user"));
		System.out.println("password: " + config.getString("app.db.password"));
	}
}
