package dojo2.service;

public class ConvertorInternalModel {

    public static String toInnerModel(String number){

        number = number.replace("IV", "IIII").replace("IX", "VIIII");

        number = number.replace("XL", "XXXX").replace("XC", "LXXXX");

        number = number.replace("CD", "CCCC").replace("CM", "DCCCC");

        return number;
    }

    public static String toExternalModel(String number){
        number = number.replace("DCCCC","CM").replace("CCCC","CD");

        number = number.replace("LXXXX", "XC").replace( "XXXX", "XL");

        number = number.replace("VIIII", "IX").replace( "IIII", "IV");

        return number;
    }


}
