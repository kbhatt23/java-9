module sampleJavaProjectForLearning {
	//see we are not exposing sampleInternal package
	exports sample;
	//lets not expose internal implementation
	//exports sampleinternal;
	
	//importing logigng
	requires java.logging;
	
	//exposing interfaces for child modules
	exports interfaces;
	
	//opening only for reflection and not available at compile time
	//as of now opening for all modules who requires this module
	opens reflectiononly to moduleConsumer;
	//exports reflectiononly;
	
	exports runner;
}
