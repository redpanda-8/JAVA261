package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //primityvus tipai:1(byte,short,int,long); 1,5(float,double); A(char); Tr/False(boolean)
    //lenght
    public static int showStringLenght(String s){
        return s.length();
    } //charAt
    public static char showLetter(String s, int index){
        return s.charAt(index);
    }
    //patikrint ar du vienodi string
    public static boolean stringEquals(String s1, String s2){
        //return s1.equals(s2); //t != T tikrina raides did maz
        return s1.equalsIgnoreCase(s2);
    }
    //ar stringe yra zodis
    public static boolean searchInString(String s, String word){
        return s.contains(word);
    }
    //isvalyti tarpus is priekio ir galo
//    public static String cleanText(String text){
//          //return text.trim();
//    }
//    public static String checkIfEmpty(String s){
//        //String text = "Some content";
//        if(!s.isEmpty()){
//            return s;
//            //System.out.println(text);
//        }
//    }
    public static String showPartTxt(String s, int start, int end){
        return s.substring(start, end);
    }
    //gauti skaiciaus indexa - grazina pozicija
    public static int getChar(String s,String letter, int index){
        return s.indexOf(letter,index);
    }
    public static String replaceWord(String s, String oldWord, String newWord){
        return s.replace(oldWord, newWord);
    }


    public static void main(String[] args){
//        norint iskviesti kita klase (kitam faile)
//        Demo.syHi();


        System.out.println(replaceWord("miestas yra Vilnius", "Vilnius", "Kaunas"));
        System.out.println(showPartTxt("Petras yra sexy",5,6));
        //System.out.println(checkIfEmpty("tekstas"));
        System.out.println(getChar("tekstas tekstas", "s", 6));
        //System.out.println("valom tarpus" +cleanText("    labai geras filmas"));
        System.out.println("ieskom zodzio " + searchInString("labai geras filmas", "geras")); //true
        System.out.println("String ilgis: ");
        System.out.println(showStringLenght("koks vardas"));
        System.out.println("raide is text: ");
        System.out.println(showLetter("Deimante", 5));
        System.out.println("tikrnam ar strng vienodi");
        System.out.println(stringEquals("Tomas", "Romas"));
    }
}