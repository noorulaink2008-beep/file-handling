import java.io.*;
import java.util.*;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "numbers.txt";

        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter 10 integer values:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = sc.nextInt();
                bw.write(num + " ");
            }

            bw.close();
            System.out.println("Data saved successfully in " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
