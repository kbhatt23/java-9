package reflectiononly;
//this package is supposed to be opens only by reflection
//we wont use exports to allow compile time usage
public class ReflectionProvider {

	public void testPublic() {
		System.out.println("jai shree ram while testing reflection for public method");
	}
	
	private void testPrivate() {
		System.out.println("jai shree ram while testing reflection for private method");
	}
}
