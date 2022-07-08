import java.io.*;
import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {
//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("./resources/test.txt"));
//            bw.write("today");
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String path = "./resources/countries.csv";
        String line = "";
//        File file = new File(path);
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){
//                System.out.println(line);
                String[] values = line.split(",");
                System.out.println(values[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Scanner scan = new Scanner(file);
//        System.out.println(scan.nextLine());
    }
}