package implementations.java;

import interfaces.ProgrammingLanguage;

import java.util.logging.*;

public class JavaProgrammingLanguage implements ProgrammingLanguage{
	private final static Logger LOGGER = Logger.getLogger(JavaProgrammingLanguage.class.getName());
	@Override
	public String compile(String inputFile) {
		 String compiledFile = inputFile.split("\\.")[0]+".class";
		 LOGGER.info("Java compiler compiled input file "+inputFile+ " to "+compiledFile);
		 return compiledFile;
	}

	@Override
	public void run(String compiledFile) {
		LOGGER.info("Java Virtual Machine is executing file "+compiledFile);
	}

}
