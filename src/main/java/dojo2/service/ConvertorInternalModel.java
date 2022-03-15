package dojo2.service;

public class ConvertorInternalModel {

    public static String toInnerModel(String number){

        number.replace("IV", "IIII").replace("IX", "VIIII");

        number.replace("XL", "XXXX").replace("XC", "LXXXX");

        number.replace("CD", "CCCC").replace("CM", "DCCCC");

        return number;
    }


}
