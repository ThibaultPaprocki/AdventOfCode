package adventofcode.day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExoDayThree {

    public static void main(String[] args) {

        int[] inputs = new int[200];
        try {
            File file = new File("/Users/alexandrepaprocki/Downloads/day/src/main/resources/InputDayThree");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            fr.close();
            System.out.println("Input List: ");
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
