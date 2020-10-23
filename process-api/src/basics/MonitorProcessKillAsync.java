package basics;

import java.util.Optional;
import java.util.function.Consumer;

public class MonitorProcessKillAsync {
	public static void main(String[] args) {
		Optional<ProcessHandle> processToMonitor = ProcessHandle.of(13712);
		Runnable r = () -> System.out.println("process do not exist");
		Consumer<ProcessHandle> c = p -> p.onExit().whenCompleteAsync((process , error) -> System.out.println("process about to exit "+p.pid()) );
		processToMonitor.ifPresentOrElse(c,  r);
	}
}
