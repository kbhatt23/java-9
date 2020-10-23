module moduleConsumer {
	requires sampleJavaProjectForLearning;
	
	// below config is manual work, importing each child modules
	//not removing it as we still are using one sample code with bad way
	requires cProgrammingLanguage;
	requires javaLanguageProgrammer;
	
	//for service config -> using service loader
	uses interfaces.ProgrammingLanguage;
}