package com.tasks;

public class StringMethods {

    public static String allSmall(String string){
        return string.toLowerCase();
    }

    public static String allSmallRemoveSpace(String string){

        return string.toLowerCase().replace(" ","");
    }

    public static String allSmallReplaceSpaceWithUnderscore(String string){
        return string.toLowerCase().replace(" ","_");
    }

    public  static String allSmallReplaceSpaceWithHyphen(String string){
        return string.toLowerCase().replace(" ","-");
    }


    public static void main(String[] args) {
        String s = "Hai I am Sanjith";

        System.out.println(StringMethods.allSmall(s));
        System.out.println(StringMethods.allSmallRemoveSpace(s));
        System.out.println(StringMethods.allSmallReplaceSpaceWithUnderscore(s));
        System.out.println(StringMethods.allSmallReplaceSpaceWithHyphen(s));
    }

}
