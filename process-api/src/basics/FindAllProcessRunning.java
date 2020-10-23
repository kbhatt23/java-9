package basics;

public class FindAllProcessRunning {
	public static void main(String[] args) {
		System.out.println("total process running "+
				ProcessHandle.allProcesses().count()
				);
		
		
		ProcessHandle.allProcesses()
			.limit(10)
			.forEach(a -> System.out.println("process found "+a.pid()));
		
	}
}
