package com.company;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "mazeData.txt";
        String something;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileRead`er in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            something = bufferedReader.readLine();
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }


        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Classroom (109, "Trinkle", 100, "CPSC", "Yes"));
        rooms.add(new Classroom (223, "Monroe", 60, "HIST", "No"));
        rooms.add(new Classroom (129, "Trinkle", 40, "CPSC", "Yes"));
        rooms.add(new Classroom (103, "Jepson", 40, "PHYS", "No"));
        rooms.add(new Classroom (220, "Trinkle", 50, "CPSC", "No"));
        int found = 0;

        try {
            System.out.println("What building are you looking for?");
            Scanner searchRoom = new Scanner(System.in);
            String searchBuilding = (searchRoom.nextLine());
            System.out.println("What is the room number in that building?");
            int searchNumber = Integer.parseInt((searchRoom.nextLine()));

            for (int i = 0; i < rooms.size(); i++) {
                Classroom temp = (Classroom) rooms.get(i);
                if (searchBuilding.equals(temp.getBuildingName()) && (searchNumber == temp.getRoomNumber())) {
                    found =9;
                    System.out.println("The information about that room is-");
                    System.out.println(temp.getRoomNumber() + " " + temp.getBuildingName() + " " + temp.getCapacity()
                            + " " + temp.getDepartment() + " " + temp.getProjector());
                }
            }
            if (found == 0) System.out.println("Sorry, that building does not exist. :(");

        } catch (NumberFormatException ex){
            System.out.println("Sorry, that building does not exist. :(");
        }
    }
}//end class Main
//david, eve, miles