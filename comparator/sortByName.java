package comparator;

import java.util.Comparator;

public class sortByName implements Comparator<product> {
 @Override
 public int compare(product o1,product o2)
 {
	 return o1.name.compareTo(o2.name);
 }

}

