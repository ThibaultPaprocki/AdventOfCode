package adventofcode.day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExoDayTwo {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/alexandrepaprocki/Downloads/day/src/main/resources/InputDayTwo");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            int goodPassword=0;
            while ((line = br.readLine()) != null) {
                sb.append(line);
               // goodPassword+=exo1DayTwo(line);
                goodPassword+=exo2DayTwo(line);
                sb.append("\n");
            }
            fr.close();
            //System.out.println("Input List: ");
          //  System.out.println(sb.toString());
            System.out.println("Nb of good passwords: "+ goodPassword);
        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

    }


    public static int exo1DayTwo(String line){ // verifPassword

        String[]lineExtract=line.split(" "); //lineExtract[0]=nbOccurence - lineExtract[1]=occurence - lineExtract[2]=lineToTest
        String[]nbOccurenceExtract=lineExtract[0].split("-");
        int nbOccurenceMin=Integer.parseInt(nbOccurenceExtract[0]);
        int nbOccurenceMax=Integer.parseInt(nbOccurenceExtract[1]);
        int nbOccurence=0;
        char occurence=lineExtract[1].charAt(0);

        for (int i=0;i<lineExtract[2].length();i++){
            if (lineExtract[2].charAt(i)==occurence)
                nbOccurence++;
        }
        if(nbOccurence<nbOccurenceMin || nbOccurence>nbOccurenceMax)
            return 0;
        else
            return 1;
    }

    public static int exo2DayTwo(String line){ // verifPassword2

        String[]lineExtract=line.split(" "); //lineExtract[0]=nbOccurence - lineExtract[1]=occurence - lineExtract[2]=lineToTest
        String[]nbOccurenceExtract=lineExtract[0].split("-");
        int nbOccurenceMin=Integer.parseInt(nbOccurenceExtract[0]);
        int nbOccurenceMax=Integer.parseInt(nbOccurenceExtract[1]);
        char occurence=lineExtract[1].charAt(0);

        if ((lineExtract[2].charAt(nbOccurenceMin-1)==occurence && lineExtract[2].charAt(nbOccurenceMax-1)!=occurence) || (lineExtract[2].charAt(nbOccurenceMin-1)!=occurence && lineExtract[2].charAt(nbOccurenceMax-1)==occurence)) {
            //System.out.println(nbOccurenceMin + ":" + nbOccurenceMax + " - " + occurence + " : " + lineExtract[2]);
            return 1;
        }
        else
            return 0;
    }
}
