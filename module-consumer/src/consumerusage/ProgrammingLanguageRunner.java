package consumerusage;

import implementations.c.CProgrammingLanguage;
import implementations.java.JavaProgrammingLanguage;
import interfaces.ProgrammingLanguage;

public class ProgrammingLanguageRunner {
	public static void main(String[] args) {

		ProgrammingLanguage language = new JavaProgrammingLanguage();
		executeCode(language,"test.java");

		language = new CProgrammingLanguage();
		executeCode(language,"test.c");
	}

	private static void executeCode(ProgrammingLanguage javaLanguage, String file) {
		String compiledFile = javaLanguage.compile(file);
		javaLanguage.run(compiledFile);
	}
}
