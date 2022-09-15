//  Lab 10 Q 1:	Write a java program based on filing. Perform Create, Read and Write operations on JSON file.

import org.json.simple.JsonObject;
import java.io.*;

public class Task1 {
    public static void main(String[] args) throws Exception {
        JsonObject obj = new JsonObject();
        File myObj = new File("filename.json");
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

        obj.put("Name: ", "Uzair Hussain");
        obj.put("Roll No: ", "21SW085");
        obj.put("Department: ", "SW");
        try {
            FileWriter myWriter = new FileWriter("filename.json");
            myWriter.write(obj.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            Reader reader = new FileReader("filename.json");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException a) {
            a.printStackTrace();
        }

    }
}