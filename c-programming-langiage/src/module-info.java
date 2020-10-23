module cProgrammingLanguage {
	requires sampleJavaProjectForLearning;
	requires java.logging;
	
	exports implementations.c;
	//priovide the package name as it is already imported/reqruies
	provides interfaces.ProgrammingLanguage with implementations.c.CProgrammingLanguage;
}