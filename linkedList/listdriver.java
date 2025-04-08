package linkedList;

public class listdriver {
	public static void main(String[] args) {
		circularLL s = new circularLL();
		s.append(10);
		s.append(20);
		s.append(30);
		s.append(40);
		s.append(50);
		s.prepend(90);

		s.insert(90, 3);
		System.out.println(s.getSize());
		
		s.delete(10);
		s.deletelast(50);
		System.out.println(s.search(30));
		s.display();
	}
}
