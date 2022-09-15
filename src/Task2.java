// Lab 10 Q 2.	Write a java program based on filing. Perform Create, Read and Write operations on 
// text file using BufferedReader and BufferedWriter Class

import java.io.*;

public class Task2 {
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
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(myObj);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("This is an example of Buffer Reader and Writer \n");
            bufferedWriter.write("we are using these methods in json file in java\n");
            bufferedWriter.write("BufferedReader / BufferedWriter.");
            bufferedWriter.flush();
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
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(myObj);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
