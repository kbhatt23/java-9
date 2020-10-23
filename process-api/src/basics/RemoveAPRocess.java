package basics;

public class RemoveAPRocess {

	public static void main(String[] args) {
		long pid = 13712;
		ProcessHandle.of(pid)
			.ifPresent( p -> p.destroy());
	}

}
