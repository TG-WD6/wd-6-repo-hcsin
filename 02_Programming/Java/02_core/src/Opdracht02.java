import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Opdracht02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello world");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
class BadTutorialException extends Exception {
    public BadTutorialException(String message)
    {
        super(message);
    }
}