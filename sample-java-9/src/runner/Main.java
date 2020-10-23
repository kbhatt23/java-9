package runner;

import sample.JokeProvider;

public class Main {
public static void main(String[] args) {
	System.out.println("jai shree ram starts");
	JokeProvider provider = new JokeProvider();
	System.out.println(provider.getJoke());
}
}
