package org.example;
import java.util.Arrays;
public class Main {
    // -----------------------------------------  ARRAY  ---------------------------------------------------------
    //ARRAY - fiksuoto dydzio-reikia znot kiek bus elementu, negalima saugot skirtingu duomenu tipu elementu-int/strng
//    public static void main(String[] args){
//        //pvz skaiciu masyvas
//        // int[] numbers =      //pridedi elementus iskart
//        // int[] numbers;       //pridesi elementus veliau
//        int numbers[] = new int[15];        //jeigu nori ji panaudoti reikia lygybes ir [kiek elementu bus]
//        System.out.println(Arrays.toString(numbers));        //print array nenaudojant ciklo - grazina 15 nuliu
//        String[] students = new String[5];        //saugant stringus - grazina null x5 - nera reiksmes, bet yra sukurta vieta
//        System.out.println(Arrays.toString(students));
//
//        //uzpildymas reiksmem paprastai
//        // vietoj int numbers[] = new int[15];
//        int numbers2[] = {122, 36, 84, 96};
//        String[] students2 = {"Tomas", "Kriste"};
//
//        //isvedimas naudojant cikla - iteruojam kokio ilgio yra masyvas, kiekvienos iteracijos metu didinam +1
//        for(int i=0; i<numbers.length; i++){ // i<20 neduoda daugiau nei 5 isvesti, nes toks masyvo ilgis
//            System.out.println(numbers2[i]); //nuo nulio tdl i, paskui dides
//            System.out.println(Arrays.toString(numbers)); //norint paziureti kokius skaicius turim
//
//        }
//        //ELEMENTU PERRASYMAS - kai fiksuotas masyvas (dbr 5 elementai)
//        //int numbers2[] = {122, 36, 84, 96};
////        for(int i=0; i<20; i++){ //eisim cikla kol bus maziau 20, ties 21 sustos
////            numbers2[i] = i*10; //i = pradzioj bus 0 ir vazios toliau, kiekviena elementa *10
////        }
//        //ELEMENTU PERRASYMAS - kai skaiciu IRASYMAS CIKLE
//        int numbers3[] = new int[20]; //sukurtas masyvas - dydis 20 - uzpildo nuliais x20
//        for(int i=0; i<20; i++){
//            numbers3[i] = i*10; // po koregavimo turim nebe nulius, o [0, 10, 20, 40.. iki 190]
//        }
//        System.out.println("po masyvo uzpildymo" + Arrays.toString(numbers3));
//    }
// ----------------------------------------------------------------------------------------------------------
    // ATSPAUSDINTI STUDENTU VIDURKI - // 1D - ONE DIMENSION ARRAY
//    public static void main(String[] args){
//        //negali print kartu nes array saugo tik 1 tipo duomenis - reik 2 array - susieti juos abu per index[0]
//        String[] students = {"Tomas", "Domas", "Petras"};   // 1D - ONE DIMENSION ARRAY
//        double[] gradesAvrg = {8.5, 9.4, 7.6};
//        System.out.println("Studentu ir ju vidurk list:");
//        for(int i=0; i<students.length; i++){
//            System.out.println("Studentas" + students[i] + "ir vidurkis:" +gradesAvrg[i]);
//        }
//
//        // ----------------------   2D - TWO DIMENSION ARRAY - MATRIX - array in array [][] ----------------------
//        String[] students2 = {"Tomas", "Domas", "Petras"};
//        int[][] gradesAvrg2 = {
//                {8, 5, 9, 7},
//                {6, 5, 8, 7},
//                {9, 8, 9, 7}
//        };
//        System.out.println("Studentu ir ju vidurk list:");
//        double sum;        // VIDURKIO ISVEDIMUI VELIAU
//        for(int i=0; i<students.length; i++){
//            sum = 0;        // VIDURKIO ISVEDIMUI VELIAU - pradedant nauja cikla (kita studenta)TURI NUSINULINTI
//            System.out.println("Studentas2: " + students2[i]);
//            System.out.println("Studento pazymiai2: ");
//            //VIDURKIO ISVEDIMUI
//            //ciklas cikle - kita raide, kad neperrasytu pirmos i
//            for(int j=0; j<gradesAvrg2[i].length; j++){ //paimam i nes pagal ka stabdyti cikla(baigiasiPazymiai)
//                System.out.println(gradesAvrg2[i][j]); //paima Tomas visi paz, tada grizta i ankstesni for ir ima Doma
//                sum += gradesAvrg2[i][j];       // VIDURKIO ISVEDIMUI
//            }
//            System.out.println("Studento vidurkis: " + sum/gradesAvrg2[i].length); //VIDURKIO ISVEDIMUI
//            System.out.println();
//        }
        // -----------------------------------------  ARRAY SORT  -----------------------------------------------------
    // PVZ rasti 3 maziaus/didziaus skaicius ------- BUBBLE SORT - nesa elementa i des puse-taip surusiuoja
    public static int[] bubbleSort(int[] array){
        int temp; //viena reiksme temporary kita sukeitimui
        boolean swap = false;
        //kiek reikia sukeitimo rounds
        for(int i=0; i<array.length-1; i++) { //array.length-1  -  pradedam nuo paskutinio array elemento
            for(int j=0; j<array.length-i -1; j++) { //array.length-i -1 - minus nuo paskutinio dbrtinio elemento ir -1
                if(array[j] > array[j+1]) { //lyginame su kitu elementu
                    temp = array[j]; //issaugom dbrtine reiksme, kuria veliau reiks panaudot
                    array[j] = array[j+1]; //pridedu kita elementa
                    array[j+1] = temp;  //SUKEITIMAS
                    swap = true; //PO KIEKVIENO SUKEITIMO NUSTATAU KAD SUKEITIMAS IVYKO
                }
            }
            if(!swap){
                break; //jei nesukeite
            }
        }
        return array; //RETURN SURUSIUOTA MASYVA
    }
    public static void main(String[] args){
        int[] numberList = {2, 56, 14, 24, 18, 4, 8};
        //toStr-tikisi array. Kvieciam bubbleSort ir jam paduodam arrayju numberList
        System.out.println(Arrays.toString(bubbleSort(numberList)));
    }
}