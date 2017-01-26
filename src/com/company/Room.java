package com.company;

public class Room {
    private int roomNumber;
    private String buildingName;
    public int capacity;

    Room( ) {  capacity = 0; }
    Room(int rN, String bN, int c) {
        setRoomNumber(rN);
        setBuildingName(bN);
        setCapacity(c);
    }
    void setRoomNumber(int rN) {
        roomNumber = rN;
    }
    void setBuildingName(String bN) {
        buildingName = bN;
    }
    void setCapacity(int c) {
        capacity = c;
    }
    int getRoomNumber() {
        return roomNumber;
    }
    String getBuildingName( ){
        return buildingName;
    }
    int getCapacity() {
        return capacity;
    }


}//end class Room