package http2usage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import jdk.incubator.http.HttpResponse.BodyHandler;

public class BasicHttp2 {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		String url = "http://www.example.com";
		HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().
				
				build();
		
		
		HttpResponse<String> responseWrapper = client.send(request, BodyHandler.asString());
		
		System.out.println("status code "+responseWrapper.statusCode());
		
		System.out.println("header "+responseWrapper.headers().map());
		String response = responseWrapper.body();
		System.out.println(response);
		
	}
}
