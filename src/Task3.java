// Lab 10 Q 3.	Write a program that opens a file in write mode(use file modes), takes name and roll no 
// from the students write it in the file and closes the file.

import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File myObj = new File("writefile.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String name, roll;

        try {
            FileWriter myWriter = new FileWriter("writefile.txt");

            System.out.println("Enter your name: ");
            name = sc.nextLine();
            System.out.println("Enter your roll no: ");
            roll = sc.nextLine();
            myWriter.write(name + "\t" + roll);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
