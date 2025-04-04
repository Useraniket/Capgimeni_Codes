package comparable;

import java.util.Arrays;

public class driver {
public static void main(String[] args) {
	 exampl1 [] students= {
			 new exampl1(1,"Aniket",99.5),
			 new exampl1(3,"Riddhi",95.5),
			 new exampl1(4,"Aishik",6.9),
			 
	 };
	 Arrays.sort(students);
	 for(exampl1 student:students)
	 {
		 System.out.println(student);
	 }
}
}
