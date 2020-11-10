package GitGyakorlas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void reader(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));

        while(sc.hasNextLine()){
            String[] data = sc.nextLine().split(",");

        }
    }
}
