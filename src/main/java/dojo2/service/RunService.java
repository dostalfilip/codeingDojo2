package dojo2.service;

import kotlin.Pair;

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

        long addToV = countI / 5;
        long realI = countI % 5;

        countV += addToV;
        long addToX = countV / 2;
        long realV = countV % 2;



    }
}
