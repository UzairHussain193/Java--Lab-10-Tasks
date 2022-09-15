// Lab 10 Q 3.	Write a program that opens a file in write mode(use file modes), takes name and roll no 
// from the students write it in the file and closes the file.

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws Exception {
        File myObj = new File("bufferfile.json");
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

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(myObj);
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
