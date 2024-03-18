import java.io.*;

public class q8 {
    public static void main(String[] args) {
        String fileName = "Welcome.txt";
        String textToInsert = "Software Engineering Department";
        
        // Check if the file exists
        File file = new File(fileName);
        if (file.exists()) {
            try (FileWriter fw = new FileWriter(fileName, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                
                // Append the file with the specified text
                out.println(textToInsert);
                System.out.println("Text appended successfully to " + fileName);
            } catch (IOException e) {
                System.err.println("Error occurred while appending text to file: " + e.getMessage());
            }
        } else {
            // If file doesn't exist, create a new file "WelcomeAgain.txt" and write the text into it
            String newFileName = "WelcomeAgain.txt";
            try (FileWriter fw = new FileWriter(newFileName);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                
                out.println("Welcome to UTeM");
                System.out.println("Text written successfully to " + newFileName);
            } catch (IOException e) {
                System.err.println("Error occurred while writing text to file: " + e.getMessage());
            }
        }
    }
}
