import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            String sharedPath = "/usr/share";
            String fileName = "output"+UUID.randomUUID()+".txt";
            String fullPath = sharedPath + "/" + fileName;
            String message = "Hello from the shared path!";
            System.out.println("File is "+fullPath);
            // Check if the directory exists, create it if necessary
            try {
                if (!Files.exists(Paths.get(sharedPath))) {
                    Files.createDirectories(Paths.get(sharedPath));
                    System.out.println("Directory created: " + sharedPath+"\r\n");
                }

                // Write to a file in the shared path
                FileWriter writer = new FileWriter(fullPath);
                writer.write(message);
                writer.close();
                System.out.println("Successfully wrote to the file: " + fullPath);
                    System.out.println("Application is running...");
                    Thread.sleep(3600000);
            } catch (Exception e) {
                System.err.println("An error occurred while writing to the shared path.");
                e.printStackTrace();
            }
        }

    }
}
