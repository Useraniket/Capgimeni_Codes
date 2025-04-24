package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class driver3 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c3 = Person.class;

		Method[] con1 = c3.getMethods(); // public no-arg constructor
		for(Method method:con1)
		{
			System.out.println(method);
		}
		System.out.println("-------------------------------------------------------");

		Method[] same_class_methods = c3.getDeclaredMethods();
		for (Method method : same_class_methods) {
			System.out.println(method);
		}
		System.out.println("-------------------------------------------------------");
 		
		@SuppressWarnings("unchecked")
		Class<Object>c2=(Class<Object>)c3.getSuperclass();
		Method[] obj=c2.getDeclaredMethods();
		for(Method method:obj)
		{
			System.out.println(method);
		}
	}
}
