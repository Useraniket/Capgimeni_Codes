package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@Target({ ElementType.FIELD, ElementType.METHOD,ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface driver {
	int value() default 12;

}

@MyAnnotations
public class driver {
	@MyAnnotations(69)
	int age;

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList i = new ArrayList();
		@Deprecated
		Integer i1=10;
	}
}
