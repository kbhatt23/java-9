package consumerusage;

import sample.HelloList;
import sample.JokeProvider;

public class ConsumerMain {
public static void main(String[] args) {
	
	System.out.println(" module consumer  prints "+HelloList.getNames());
	//if we do not eput in exports then it wont show up
	//InternalListSupplier.supplyList();
	
	System.out.println("===========lets go for joke game==============");
	JokeProvider joker = new JokeProvider();
	System.out.println(joker.getJoke());
	
}
}
