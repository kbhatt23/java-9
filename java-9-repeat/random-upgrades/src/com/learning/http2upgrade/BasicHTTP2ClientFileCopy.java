package com.learning.http2upgrade;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class BasicHTTP2ClientFileCopy {
public static void main(String[] args) throws Exception{
	HttpClient client = HttpClient.newBuilder().build();
	
	//String url = "http://www.google.com";
	String url = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";
	HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().build();
	
	HttpResponse<Path> responseWrapper = client.send(request, HttpResponse.BodyHandler.asFile(Paths.get("C:\\Kanishk\\learning\\java-9\\file.txt")));
	
	System.out.println("status code: "+responseWrapper.statusCode());
	
	System.out.println("==============headers================");
	responseWrapper.headers().map().forEach((k,v) -> System.out.println(k+ " : "+v));
	System.out.println("==============headers================");
	
	System.out.println("Response body: "+responseWrapper.body());
}
}
