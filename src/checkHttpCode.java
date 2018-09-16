package DemoPakage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import jdk.management.resource.internal.inst.ThreadRMHooks;

public class checkHttpCode {

	public static void main(String[] args) throws IOException {

		String testUrl = "https://www.google.com/";
		int httpResponse;
		URL url = new URL(testUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		httpResponse = connection.getResponseCode();
		System.out.println("Response code of the url is :"+httpResponse);
		

	}

}
