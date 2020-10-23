module gsonMigration {
	//we can import module gson from google.gson jar
	requires gson;
	requires java.sql;
	//only main class is exposed to other modules
	//inner breans are not exposed
	exports runner;
	
	//gson is using reflection so we need to open
	opens bean to gson;
}