package comparator;

import java.util.Arrays;

public class driver {
public static void main(String[] args) {
	 product [] students= {
			 new product(1,"Aniket",99.5),
			 new product(3,"Riddhi",95.5),
			 new product(4,"Aishik",6.9),
			 
	 };
	 sortByName n=new sortByName();
	 Arrays.sort(students,n);
	 for(product student:students)
	 {
		 System.out.println(student);
	 }
}
}
