package set;
import java.util.*;

public class driver2 {
	public static void main(String[] args) {
//		Set studentSet = new LinkedHashSet();//using generics
//
//
//		studentSet.add(10);
//		studentSet.add("hi");
//		studentSet.add(17.5); 
////		studentSet.add(null); 
//
//		System.out.println(studentSet);
		
		//-------------------------------------------------------------------
		
		Set st=new TreeSet();//if done like this we get class cast exception(should be homogenious in nature 
		st.add(10);
		st.add("hi");
		st.add(17.5); 
//		studentSet.add(null); 

		System.out.println(st);
		
		//--------------------------------------------------------------------
		
	}
}
