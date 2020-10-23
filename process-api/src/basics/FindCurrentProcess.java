package basics;

public class FindCurrentProcess {
	public static void main(String[] args) {
		ProcessHandle current = ProcessHandle.current();
		System.out.println(current.pid());
		System.out.println(current.info());
		
		System.out.println("user of process "+current.info().user().get());
	}
}
