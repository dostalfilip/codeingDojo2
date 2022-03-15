package dojo2;

import dojo2.service.ConvertorInternalModel;
import kotlin.Pair;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        final String firstNumber = in.nextLine();

        System.out.println("Zadej druhe cislo:");
        final String secondNumber = in.nextLine();

        System.out.println("You entered string " + firstNumber);
        System.out.println("You entered string " + secondNumber);

        extracted(firstNumber, secondNumber);

        in.close();
    }

    private static Pair<String, String> extracted(String firstNumber, String secondNumber) {
        final String internalFirst  = ConvertorInternalModel.toInnerModel(firstNumber);
        final String internalSecond  = ConvertorInternalModel.toInnerModel(secondNumber);

        System.out.println("First Converted to string " + internalFirst);
        System.out.println("Second Converted to string " + internalSecond);

        return new Pair(internalFirst, internalSecond);
    }

}
