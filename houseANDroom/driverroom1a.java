package houseANDroom;

public class driverroom1a {
public static void main(String[] args) {
	Room1a room =new Room1a(19);
	house1a house=new house1a("blue",room);
	System.out.println(house.getColor());
	System.out.println(house.getRoom().getarea());
}
}
