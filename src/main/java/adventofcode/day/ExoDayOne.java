package adventofcode.day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ExoDayOne {
    public static void main(String[] args) {

        int[] inputs = new int[200];
        try {
            File file = new File("/Users/alexandrepaprocki/Downloads/day/src/main/resources/InputDayOne");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                inputs[i] = Integer.parseInt(line);
                sb.append("\n");
                i++;
            }
            fr.close();
            System.out.println("Input List: ");
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        System.out.println(exo1DayONE(inputs));
        System.out.println(exo2DayONE(inputs));
    }
    public static int exo1DayONE(int[] inputs){
        for (int i=0;i<inputs.length;i++){
            for (int testnumbers=i+1;testnumbers< inputs.length;testnumbers++) {
                if (2020 - (inputs[i] + inputs[testnumbers]) == 0) {
                    System.out.println(inputs[i] +" + "+inputs[testnumbers]+" : le résultat est: " + (inputs[i] + inputs[testnumbers]));
                    System.out.println(inputs[i] +" * "+inputs[testnumbers]+" : le résultat est: " + (inputs[i] * inputs[testnumbers]));
                    return inputs[i] * inputs[testnumbers];
                }
            }
        }
        return 0; //If None of these inputs add with another input equal 2020.
    }

    public static int exo2DayONE(int[] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            for (int testnumbers = i + 1; testnumbers < inputs.length; testnumbers++) {
                for (int testnumbers2 = i + 2; testnumbers2 < inputs.length; testnumbers2++) {
                    if (2020 - (inputs[i] + inputs[testnumbers] + inputs[testnumbers2]) == 0) {
                        System.out.println(inputs[i] + " + " + inputs[testnumbers] + " + " + inputs[testnumbers2] + " : le résultat est: " + (inputs[i] + inputs[testnumbers] + inputs[testnumbers2]));
                        System.out.println(inputs[i] + " * " + inputs[testnumbers] + " * " + inputs[testnumbers2] + " : le résultat est: " + (inputs[i] * inputs[testnumbers] * inputs[testnumbers2]));
                        return inputs[i] * inputs[testnumbers] * inputs[testnumbers2];
                    }
                }
            }
        }
        return 0; //If None of these inputs add with 2 other inputs equal 2020.
    }
}