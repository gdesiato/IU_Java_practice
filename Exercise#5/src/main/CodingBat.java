package main;

public class CodingBat {

    public static void main(String[] args) {

        String s = "Hellociaocomestai";
        System.out.println(stringX(s));
        System.out.println(altPairs(s));
    }

    public static String stringX(String str) {
        String strBeg = "x";
        String body = str.replace("x","");
        String finalS = "";
        if (str.charAt(0) == 'x'){
            finalS = strBeg + body + strBeg;
        } else {
            finalS = body;
        }
        return finalS;
    }

    public static String altPairs(String str) {
        String newS = "";
        for (int i = 0; i < str.length(); i+=4){

            newS += str.charAt(i);

            if (i + 1 < str.length()) {
                newS += str.charAt(i+1);
            }
        }
        return newS;
    }

}
