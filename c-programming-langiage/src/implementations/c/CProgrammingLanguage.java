package implementations.c;

import interfaces.ProgrammingLanguage;

import java.util.logging.*;

public class CProgrammingLanguage implements ProgrammingLanguage{
	private final static Logger LOGGER = Logger.getLogger(CProgrammingLanguage.class.getName());
	@Override
	public String compile(String inputFile) {
		 String compiledFile = inputFile.split("\\.")[0]+".gcc";
		 LOGGER.info("C compiler compiled input file "+inputFile+ " to "+compiledFile);
		 return compiledFile;
	}

	@Override
	public void run(String compiledFile) {
		LOGGER.info("Native O.S is executing file "+compiledFile);
	}

}
