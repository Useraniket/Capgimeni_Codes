package map;
import java.util.*;
public class hashMap {
public static void main(String[] args) {
	HashMap<Integer,String>h=new HashMap<Integer,String>();
	h.put(1,"Aniket");
	h.put(2,"Ai");
	h.put(3,"Ri");
	h.put(4,"Si");
	System.out.println(h);
	System.out.println(h.getOrDefault(2, "ai"));
	System.out.println(h.get(1));
	
}
}
