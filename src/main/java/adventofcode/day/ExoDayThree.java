package adventofcode.day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExoDayThree {

    public static void main(String[] args) {

        String[] inputs = new String[2000];
        try {
            File file = new File("/Users/alexandrepaprocki/Desktop/AdventOfCode/src/main/resources/InputDayThree");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            int nbTree = 0;
            int schema=0;
            while ((line = br.readLine()) != null && schema+3<line.length()) {
                sb.append(line);
                nbTree+=exo1DayThree(line, schema);
                sb.append("\n");
                schema+=3;
/*              if (schema+3<line.length())
                    schema+=3;
                else
                    schema=3;*/
            }
            fr.close();
           // System.out.println("Input List: ");
           // System.out.println(sb.toString());
           System.out.println("Nb Tree: "+nbTree);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }


    public static int exo1DayThree(String inputs, int schema){
        if(inputs.charAt(schema) == '#')
               return 1;
        return 0;
    }
}
