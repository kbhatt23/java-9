package com.learning.http2upgrade;

import java.net.URI;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class BasicHTTP2Client {
public static void main(String[] args) throws Exception{
	HttpClient client = HttpClient.newBuilder().build();
	
	//String url = "http://www.google.com";
	String url = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";
	HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().build();
	
	HttpResponse<String> responseWrapper = client.send(request, HttpResponse.BodyHandler.asString());
	
	System.out.println("status code: "+responseWrapper.statusCode());
	
	System.out.println("==============headers================");
	responseWrapper.headers().map().forEach((k,v) -> System.out.println(k+ " : "+v));
	System.out.println("==============headers================");
	
	System.out.println("Response body: "+responseWrapper.body());
}
}
