package playing_with_objects;

public class bankdepo {
public static void main(String[] args) {
	bankAcc b=new bankAcc();
	b.deposit(1000.98);  
    System.out.println(b.getBalance());
}
}
