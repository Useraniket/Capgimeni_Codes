package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class driver2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c3 = Person.class;

		Constructor<Person> con1 = c3.getConstructor(); // public no-arg constructor
		System.out.println("Public no-arg Constructor: " + con1);
		System.out.println("-------------------------------------------------------");

		Constructor<?>[] con2 = c3.getDeclaredConstructors(); // all declared constructors
		System.out.println("All Declared Constructors (array): " + Arrays.toString(con2));
		System.out.println("-------------------------------------------------------");

		Constructor<Person> con3 = c3.getDeclaredConstructor(String.class, int.class); // any specific one
		System.out.println("Specific Constructor (String, int): " + con3);
		System.out.println("-------------------------------------------------------");

		System.out.println("All Declared Constructors:");
		for (Constructor<?> constructor : con2) {
			System.out.println(constructor);
		}

		System.out.println("-------------------------------------------------------");
		Constructor<Person> privateCtor = c3.getDeclaredConstructor(String.class, int.class);
		Person p3 = privateCtor.newInstance("Aniket",21);
		System.out.println(p3);

	}
}
