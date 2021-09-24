import Prog1Tools.IOTools;

import java.util.Locale;

public class StringTests {
    public static void main(String[] args) {
        // Mit String Builder
//        StringBuilder txt = new StringBuilder("abcdefghijklmnopqrstuvw");
//        for(int i=0; i< txt.length(); i++){
//            if(i%2 != 0){
//                char c = txt.charAt(i);
//                String n = String.valueOf(c).toUpperCase();
//                c = n.charAt(0);
//                txt.setCharAt(i, c);
//            }
//        }
//        System.out.println(txt);
        // Ohne Stringbuilder
        String test = "abcdefghijklmnopqrstuvw";
        String loesung = "";
        for(int i=0; i< test.length(); i++){
            char c = test.charAt(i);
            if(i%2 != 0){
                String n = String.valueOf(c).toUpperCase();
                loesung += n;
            }else{
                loesung += c;
            }
        }
        System.out.println(loesung);

        String inputText = IOTools.readLine("Text - optional mit : trennen");

        if(inputText.contains(":")){
            // Wir haben Doppelpunkte
            String[] inputParts = inputText.split(":");
            for( String s : inputParts ){
                System.out.println(s);
            }
        }
    }
}
