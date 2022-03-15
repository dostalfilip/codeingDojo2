package dojo2.service;

public class ConvertorInternalModel {

    public static String toInnerModel(String number){

        number = number.replace("IV", "IIII").replace("IX", "VIIII");

        number = number.replace("XL", "XXXX").replace("XC", "LXXXX");

        number = number.replace("CD", "CCCC").replace("CM", "DCCCC");

        return number;
    }

    public static String toExternalModel(String number){
        number = number.replace("CM", "DCCCC").replace("CD", "CCCC");

        number = number.replace("XC", "LXXXX").replace("XL", "XXXX");

        number = number.replace("IX", "VIIII").replace("IV", "IIII");

        return number;
    }


}
