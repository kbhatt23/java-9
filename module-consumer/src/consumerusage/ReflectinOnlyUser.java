package consumerusage;

import java.lang.reflect.Method;

//not exports in provier module and hence can not import it
//import reflectiononly.ReflectionProvider;

public class ReflectinOnlyUser {
public static void main(String[] args) {
	//not possible as there is no export
	//ReflectionProvider obj = new ReflectionProvider();
	
	try {
		Class<?> reflectionOnlyClass = Class.forName("reflectiononly.ReflectionProvider");
		//we are fetching all public methods//accesible methods -> no arg method
		Method declaredMethod = reflectionOnlyClass.getDeclaredMethod("testPublic");
		declaredMethod.invoke(obj, args)
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
