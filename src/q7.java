import java.io.*;

public class q7 {
    public static void main(String[] args) {
        String fileName = "Welcome.txt";
        String textToInsert = "Welcome To UTeM";

        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            
            out.println(textToInsert);
            System.out.println("Text inserted successfully into " + fileName);
        } catch (IOException e) {
            System.err.println("Error occurred while inserting text: " + e.getMessage());
        }
    }
}
