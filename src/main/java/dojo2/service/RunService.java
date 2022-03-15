package dojo2.service;

import kotlin.Pair;
import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

public class RunService {

    public static Pair<String, String> toinnerModel(String firstNumber, String secondNumber) {
        final String internalFirst = ConvertorInternalModel.toInnerModel(firstNumber);
        final String internalSecond = ConvertorInternalModel.toInnerModel(secondNumber);

        System.out.println("First Converted to string " + internalFirst);
        System.out.println("Second Converted to string " + internalSecond);

        return new Pair(internalFirst, internalSecond);
    }

    public static void run() {
        Scanner in = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        final String firstNumber = in.nextLine();

        System.out.println("Zadej druhe cislo:");
        final String secondNumber = in.nextLine();

        in.close();


        System.out.println("You entered string " + firstNumber);
        System.out.println("You entered string " + secondNumber);

        Pair<String, String> pair = toinnerModel(firstNumber, secondNumber);

        String together = pair.getFirst().concat(pair.getSecond());

        long countI = together.chars().filter(ch -> ch == 'I').count();
        long countV = together.chars().filter(ch -> ch == 'V').count();
        long countX = together.chars().filter(ch -> ch == 'X').count();
        long countL = together.chars().filter(ch -> ch == 'L').count();
        long countC = together.chars().filter(ch -> ch == 'C').count();
        long countD = together.chars().filter(ch -> ch == 'D').count();
        long countM = together.chars().filter(ch -> ch == 'M').count();

        //I
        long addToV = countI / 5;
        long realI = countI % 5;

        //V
        countV += addToV;
        long addToX = countV / 2;
        long realV = countV % 2;

        //X
        countX += addToX;
        long addToL = countX / 5;
        long realX = countX % 5;

        //L
        countL += addToL;
        long addToC = countL / 2;
        long realL = countL % 2;

        //C
        countC += addToC;
        long addToD = countC / 5;
        long realC = countC % 5;

        //D
        countD += addToD;
        long addToM = countD / 2;
        long realD = countD % 2;

        //M
        countM += addToM;


    String result =    ConvertorInternalModel.toExternalModel(StringUtils.repeat("M", (int) countM) + StringUtils.repeat("D", (int) countD) + StringUtils.repeat("C", (int) countC) + StringUtils.repeat("L", (int) countL) + StringUtils.repeat("X", (int) countX) + StringUtils.repeat("V", (int) countV) + StringUtils.repeat("I", (int) countI));
        System.out.println(result);
    }
}