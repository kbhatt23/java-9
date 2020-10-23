package consumerusage;

import java.util.Map;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import interfaces.ProgrammingLanguage;

public class ProgrammingLanguageServiceLoader {
	public static void main(String[] args) {

		ServiceLoader<ProgrammingLanguage> languagesLoader = ServiceLoader.load(ProgrammingLanguage.class);
		/*
		 * Map<ProgrammingLanguage, String> languageMap = languagesLoader.stream()
		 * .collect(Collectors.toMap(e -> e.get(),e-> { ProgrammingLanguage lang =
		 * (ProgrammingLanguage)e; return
		 * lang.getClass().getSimpleName().equals("JavaProgrammingLanguage") ?
		 * "test.class": "test.c"; }));
		 */
		
		//languageMap.forEach((ProgrammingLanguageServiceLoader::executeCode));
		
		for(ProgrammingLanguage lang :languagesLoader) {
			executeCode(lang, lang.getClass().getSimpleName().contains("JavaProgrammingLanguage") ? "test.java" : "test.c");
		}
	}

	private static void executeCode(ProgrammingLanguage javaLanguage, String file) {
		String compiledFile = javaLanguage.compile(file);
		javaLanguage.run(compiledFile);
	}
}
