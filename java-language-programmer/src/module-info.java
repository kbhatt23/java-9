module javaLanguageProgrammer {
	requires sampleJavaProjectForLearning;
	requires java.logging;
	exports implementations.java;
	
	//priovide the package name as it is already imported/reqruies
	provides interfaces.ProgrammingLanguage with implementations.java.JavaProgrammingLanguage;
}