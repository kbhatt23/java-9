package interfaces;

//can have multiple languages -> lets implement in other module project
public interface ProgrammingLanguage {

	String compile(String inputFile);
	
	void run(String compiledFile);
	
}
