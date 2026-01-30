package org.example;

public class Main1 {
    //method kuris PRIIMA ARRAY, UPDATE ir RETURN
    // [] norim ARRAY, kurio VYKDYMO metu turi gauti (int) ARRAY, bet dar nznom koks array bus paduotas
    public static int[] updateArray(int[] array){
        //grazins pakoreguota array
        for(int i=0; i<array.length; i++){
            array[i] = i + 5 * 3;
        }
        return array; //grazins masyva
    }
    // VOID TIPO GRAZINIMAS (VOID negrazina, o ISVEDA/print) - int[] arrayTikPavadinmas
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        int[] list = new int[10];   //susikuriam masyva - jo dydis 10
        // kadangi jis grazins masyvas KURI VELIAU NORIM NAUDOTI tdl pradzioj int[] numbersList =
        // GRAZINS ARRAY IR JI PRISKIRIAM KINTAMAJAM numberList
        int[] numbersList = updateArray(list); //kvieciu func upd, jam duodu PARAMETRA LIST
        printArray(numbersList); //norint perziuret array
    }

    // KAIP SUTRUMPINT 20-25 eilutes - nekuriant kintamojo
//    public static void main(String[] args){
//        int [] list = new int[10];
//        printArray(updateArray(list)); // kviest iskart method updArray
//    }
}
