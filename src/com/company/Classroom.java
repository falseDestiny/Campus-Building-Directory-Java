package com.company;

public class Classroom extends Room{
    public int capacity;
    private String department;
    private String projector;

    Classroom(int rN, String bN, int c, String dept, String proj) {
        setRoomNumber(rN);
        setBuildingName(bN);
        setCapacity(c);
        setDepartment(dept);
        setProjector(proj);
    }
    private void setDepartment(String dept) {
        department = dept;
    }
    private void setProjector(String proj) {
        projector = proj;
    }
    String getDepartment( ){
        return department;
    }
    String getProjector( ){
        return projector;
    }

}//end class Classroom