package methodRefernece;

public class driver {
public static void main(String[] args) {
	operation o=(a,b)-> a+b;
	int res=o.operate(10, 20);
	System.out.println(res);
}
}
