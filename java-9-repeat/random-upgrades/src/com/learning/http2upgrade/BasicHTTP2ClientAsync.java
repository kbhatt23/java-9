package com.learning.http2upgrade;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class BasicHTTP2ClientAsync {
public static void main(String[] args) throws Exception{
	HttpClient client = HttpClient.newBuilder().build();
	
	//String url = "http://www.google.com";
	String url = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";
	HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().build();
	
	CompletableFuture<HttpResponse<String>> sendAsync = client.sendAsync(request, HttpResponse.BodyHandler.asString());
	
	CompletableFuture<Void> thenAccept = sendAsync.thenAccept(str -> System.out.println(str.body()) );
	System.out.println("chain created");
	thenAccept.get();
	System.out.println("task completed");
}
}
