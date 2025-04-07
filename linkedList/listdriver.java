package linkedList;

public class listdriver {
public static void main(String[] args) {
	singlell1 s=new singlell1();
	s.append(10);
	s.append(20);
	s.append(30);
	s.append(40);
	s.append(50);
//	s.insert(90,3);S
//	s.deletelast(50);
	s.reverse();
	s.display();
}
}
