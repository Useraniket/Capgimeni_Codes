package comparator;

import java.util.Comparator;

public class sortByPercentage implements Comparator<product> {
 @Override
 public int compare(product o1,product o2)
 {
	 return Double.compare(o1.percentage, o2.percentage);
 }
}
