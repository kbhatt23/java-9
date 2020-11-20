package com.learning.processapis;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessUtil {

	private static final String NO_COMMAND = "No Command";
	private static final String NO_USER = "No User";
	private static final String SEPERATOR = " : ";
	private static final Predicate<? super ProcessHandle> ALIVE_PREDICATE = process -> process.isAlive();
	private static final Predicate<? super ProcessHandle> ACTIVE_PROCESS_PREDICATE = process -> process.info().user().isPresent();
	private static final Runnable PROCESS_NOT_PRESENT = () -> System.out.println("Process not present with supplied pid");

	//first one is processhandle 
	// -> now we can get process id from one proces and easily view the info regarding the process
	public static void printAllProcessDetails() {
		ProcessHandle.allProcesses()
					 .filter(ALIVE_PREDICATE) // active process only
					 .filter(ACTIVE_PROCESS_PREDICATE)//whihc is not daemon process
					 .map(ProcessUtil::transformProcessDetails)
					 .forEach(System.out::println);
	}
	
	public static void printCurrentProcessdetails() {
		System.out.println(transformProcessDetails(ProcessHandle.current()));
	}
	
	public static void printPRocessWithId(long pid) {
		ProcessHandle.of(pid)
			.filter(ALIVE_PREDICATE)
			.filter(ACTIVE_PROCESS_PREDICATE)
			.map(ProcessUtil::transformProcessDetails)
			.ifPresentOrElse(System.out::println,PROCESS_NOT_PRESENT  ); 
			;
	}
	
	public static String transformProcessDetails(ProcessHandle processHandle) {
		StringBuilder sb = new StringBuilder();
		sb.append(processHandle.pid())
		  .append(SEPERATOR)
		  .append(processHandle.info().user().orElse(NO_USER))
		  .append(SEPERATOR)
		  .append(processHandle.info().command().orElse(NO_COMMAND))
		  .append(SEPERATOR)
		  .append(processHandle.info().arguments().map(
				  items -> Arrays.stream(items).collect(Collectors.joining(","))
				  ))
		  
		  ;
			
		return sb.toString();
	}
	
	public static long findProcessCountContainingName(String name) {
		return ProcessHandle.allProcesses()
		 .filter(ALIVE_PREDICATE) // active process only
		 .filter(ACTIVE_PROCESS_PREDICATE)//whihc is not daemon process
		 .filter(process -> process.info().command().filter(a -> a.contains(name)).isPresent())
		 .count();
	}
	
	public static void createProcess(String... command) throws IOException {
		ProcessBuilder builder = new ProcessBuilder(command);
		Process start = builder.start();
		System.out.println("Started a new process with below details : ");
		System.out.println(transformProcessDetails(start.toHandle()));
	}
	
	public static void killProcess(long pid) {
		ProcessHandle.of(pid)
					 .ifPresentOrElse(ProcessHandle::destroy, PROCESS_NOT_PRESENT);
		
		;
	}
}
