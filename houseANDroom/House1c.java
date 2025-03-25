package houseANDroom;

public class House1c {
private String color;
private Room1c room;
public House1c(String color,double area)
{
	this.color=color;
	room=new Room1c(area);
}


public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


public Room1c getRoom() {
	return room;
}


public void setRoom(Room1c room) {
	this.room = room;
}

}