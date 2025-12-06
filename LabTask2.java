import java.io.*;
import java.util.*;

public class LabTask2 {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        ArrayList<Integer> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(fileName));

            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }

            Collections.sort(list);

            System.out.println("Sorted Data:");
            for (int num : list) {
                System.out.print(num + " ");
            }

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}
