package runner;

import java.io.FileWriter;
import java.io.IOException;

//not getting i,mported as we added jar in module path -> whihc creates automatic module
//the jar classpth
//
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import bean.Address;
import bean.Person;

public class Main {
public static void main(String[] args) throws JsonIOException, IOException {
	Address address = new Address("vaikuntha lok", "narayan samita", "sarvatra", "everything");
	Person p = new Person(1, "sita ram", -1, address);
	
	System.out.println("Requesting JSON conversion for Person  "+p);
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	String jsonInString = gson.toJson(p);
	System.out.println("JSON populated "+jsonInString);
}
}
