package org.example;

public class Demo {
    public static void syHi(){
        System.out.println("Hello");
        System.out.println("Hello"); //rasant sout enter
    }
    // norint kad klase butu runnable - jeigu sito nera tada Main.java turi buti
//    public class Main{
//        public static void main(String[]args){
//        Demo.syHi();
//        }

    public static void main(String[] args){
        syHi();
        System.out.println("Hello banana");
    }
}
/*
package org.example;

public class Demo1 {
}


------------------------------------  MAIN.JAVA   FAILE PAMOKA 1: --------------------------------
package org.example;

public class Main {

    public static void main(String[] args){
        System.out.println("Byte tipas");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Short tipas");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("Int tipas");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Long tipas");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        int number = 12;
        int count = 1;
        char letter = 'A';
        double sum = 125.45;
        float sum = 125,45f;
        boolean isOnline = true;
        System.out.println("My number:" +number + ". Count" +count+". Letter" +letter);
        System.out.println("Sum:" +sum+ ". Is online" +isOnline);

        byte smallByte = 25;
        short smallShort = 250;
        int smallInt = 2500;

        // WRAPPER CLASS - parasyti pvz Int/Long is D raides - klase kuri ideda i vidu savo primityvu tipa
        // kad veliau butu galima naudoti tuos methods kuriuos turi ta klase

        String firstName = "Kristina";
        System.out.println(firstName.charAt(0));
        for(int i = 0; i <firstName.length(); i++) {
            if (firstName.charAt(i) == 't') {
                continue; //praleidzia 1 raide
            }else if(firstName.charAt(i)=='n'){
                continue;
            }else{
                System.out.println(firstName.charAt(i));;
            }

        }
    }
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
}
---------------------------------------
public class Main {
//    public static String showName(String name) {
//        if (name == "Tomas") {
//            return name;
//        } else {
//            return "tai ne Tomas";
//        }
//    }
//    public static void main(String[] args){
//        System.out.println(showName("Tomas"));
//    }

        public static int showStringLenght(String s){ //lenght
                return s.length();

            public static String replaceWord(String s, String oldWord, String newWord){
                return s.replace(oldWord, newWord);
            }
            public static void main(String[] args){
                //System.out.println(checkIfEmpty("tekstas"));
                System.out.println("ieskom zodzio " + searchInString("labai geras filmas", "geras")); //true
                System.out.println(showStringLenght("koks vardas"));
            }

            package org.example;

            public class Main1 {
                public String helloName(String name){
                    return "Hello"+name+ "!";
                }
                public static void main(String[] args){
                    System.out.println();
                }

            }
}
 */