/*
Program: Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. 
        In this class the member functions are setdata and displaydata.		

@author: Sonu Sharma
@Date: 1 Sep 2022
*/

class Room {
	
	// creating instance variable
    private int roomNo, roomArea;
    private String roomType;
    private boolean hasAC;

	// creating a method to initialize the instance varible
    void setRoomData(int roomNo, int roomArea, String roomType, boolean hasAC) {
        
		this.roomNo = roomNo;
		this.roomArea = roomArea;
		this.roomType = roomType;
		this.hasAC = hasAC;
		
    }
	
	// creating a method to print data of Room
	void getRoomData() {
		
		System.out.println("Room No : " +this.roomNo);
		System.out.println("Room Area : " +this.roomArea + "sqft");
		System.out.println("Room Type : " +this.roomType);
		
		// checking if the room has Ac
		if(this.hasAC)			
			System.out.println("Room Does not have AC\n");
		else
			System.out.println("Room have AC : \n");
	}
}

public class RoomDetails {
	
    public static void main(String[] args) {
        
		// creating object of Room Class
		Room objRoom = new Room(); 
		
		// calling a method of Room Class
		objRoom.setRoomData(101, 500, "1 BHK", false);
		objRoom.getRoomData();
		
		objRoom.setRoomData(102, 1500, "4 BHK", true);
		objRoom.getRoomData();
		
		objRoom.setRoomData(103, 1000, "2 BHK", true);
		objRoom.getRoomData();
    }
}
