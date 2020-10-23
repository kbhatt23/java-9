package consumerusage;

import java.lang.reflect.Constructor;

import sample.JokeProvider;

public class ReflectinUSage {
public static void main(String[] args) {
	Class<JokeProvider> clazz = JokeProvider.class;
	//calling no arg constructor
	try {
	Constructor<JokeProvider> declaredConstructor = clazz.getDeclaredConstructor();
	JokeProvider newInstance = declaredConstructor.newInstance();
	System.out.println(newInstance.getJoke());
	}catch (Exception e) {
		System.out.println("exception occcured "+e);
	}
}
}
