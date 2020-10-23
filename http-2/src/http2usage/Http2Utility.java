package http2usage;

import java.net.URI;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpRequest.BodyProcessor;
import jdk.incubator.http.HttpResponse;
import jdk.incubator.http.HttpResponse.BodyHandler;

public class Http2Utility {

	private static HttpClient client = HttpClient.newHttpClient();
	public static void callGetSync(String url, boolean isFile , String fileName) throws Exception{
		HttpRequest req = HttpRequest.newBuilder(new URI(url)).GET().build();
		
		BodyHandler bodyHandler = isFile ? BodyHandler.asFile(Paths.get(fileName)):BodyHandler.asString();
		HttpResponse<String> responseWrapper = client.send(req, bodyHandler);
		processResponseWrapper(responseWrapper);
	}
	
	
	private static void processResponseWrapper(HttpResponse<String> responseWrapper) {
		
		System.out.println("Response status code "+responseWrapper.statusCode());
		System.out.println("Headers: \t");
		responseWrapper.headers().map().forEach((k,v) -> System.out.println(k + " : "+v));
	
		System.out.println("=================================");
		System.out.println("Response body: ");
		System.out.println(responseWrapper.body());
	}
	
	public static void callPostSync(String url, boolean isFile , String fileName) throws Exception{
		HttpRequest req = HttpRequest.newBuilder(new URI(url)).
					POST(BodyProcessor.fromString("request1: value2, request2: value2"))
					.build();
		
		BodyHandler bodyHandler = isFile ? BodyHandler.asFile(Paths.get(fileName)):BodyHandler.asString();
		HttpResponse<String> responseWrapper = client.send(req, bodyHandler);
		processResponseWrapper(responseWrapper);
	}
	
	public static void callGetASync(String url, boolean isFile , String fileName) throws Exception{
		HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().build();
		
		CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request, BodyHandler.asString());
		//completable future is non blockijg so thread continues
		
		System.out.println("Request already initiated");
		
		//even this will be non blocking and new line will start
		//whenever response comes task will be done
		//responseFuture.thenAcceptAsync(Http2Utility :: processResponseWrapper);
		//responseFuture.thenAccept(Http2Utility :: processResponseWrapper);
		
		while(!responseFuture.isDone()) {
			System.out.println("task in progress");
		}
		processResponseWrapper(responseFuture.get());
		System.out.println("Pipeline processed succesfully");
	}
	
}
