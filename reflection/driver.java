package reflection;

public class driver {
	public static void main(String[] args) throws ClassNotFoundException {
    
		Class<Person>c3=Person.class;//1rst way
		@SuppressWarnings("unchecked")
		Class<Person>c1 =(Class<Person>)new Person("Aniket",21).getClass();//2nd way
		@SuppressWarnings("unchecked")
		Class<Person>c2 =(Class<Person>)Class.forName("/capg_code/src/reflection/Person.java");//3rd way
		
    }
}
