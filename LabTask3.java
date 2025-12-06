import java.io.*;
import java.util.*;

public class LabTask3 {

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        ArrayList<Integer> list = new ArrayList<>();

        try {
            // Read file
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }

            // Remove primes
            ArrayList<Integer> nonPrimeList = new ArrayList<>();
            for (int num : list) {
                if (!isPrime(num)) {
                    nonPrimeList.add(num);
                }
            }

            // Write back to file
            FileWriter fw = new FileWriter(fileName);
            for (int num : nonPrimeList) {
                fw.write(num + " ");
            }
            fw.close();

            System.out.println("Prime numbers removed successfully.");
            System.out.println("Updated File Data: " + nonPrimeList);

        } catch (Exception e) {
            System.out.println("Error processing file.");
        }
    }
}
