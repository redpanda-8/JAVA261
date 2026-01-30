package org.example;
import java.util.ArrayList;

public class Main {

    static ArrayList<String> clients = new ArrayList<>();
    static ArrayList<String> categories = new ArrayList<>();
    static ArrayList<String> bookTitles = new ArrayList<>();
    static ArrayList<String> bookDescriptions = new ArrayList<>();
    static ArrayList<Integer> bookCategoryIndex = new ArrayList<>();
    static ArrayList<Integer> bookClientIndex = new ArrayList<>();

    public static void main(String[] args) {
        seedData();
        bubbleSortClients();            // A) bubble sort + neprarasti rysio
        printClientsWithBooks();        // A) spausdinimas su knygomis
        printBooksByCategories();       // B) pagal kategorijas

        searchBooks("java");            // C) search
        searchBooks("fantast");
        searchBooks("balansas");
        searchBooks("nieko");
    }
    // -------------------- SEED --------------------
    static void seedData() {
        // 5 klientai
        clients.add("Jonas");
        clients.add("Mantas");
        clients.add("Aiste");
        clients.add("Greta");
        clients.add("Tomas");

        // 10 books (su aprasymais), kategorijas dedam per getOrAddCategoryIndex
        addBook("Haris Poteris", "Berniuko burtininko nuotykiai", "Fantastika", -1);
        addBook("Žiedų valdovas", "Kova už viduržemę", "Fantastika", -1);
        addBook("Clean Code", "Programavimo geroji praktika", "Programavimas", 0); // Jonas
        addBook("Effective Java", "Java kalbos patarimai", "Programavimas", -1);
        addBook("Java pagrindai", "Įvadas į Java", "Programavimas", 2); // Aiste
        addBook("Emocinis intelektas", "Kaip suprasti save", "Psichologija", -1);
        addBook("Mąstyk ir būk turtingas", "Motyvacinė knyga", "Psichologija", 0); // Jonas
        addBook("1984", "Distopinis romanas", "Fantastika", -1);
        addBook("Duomenų struktūros", "Algoritmų pagrindai", "Programavimas", 4); // Tomas
        addBook("Sąmoningumas", "Gyvenimo balansas", "Psichologija", -1);
    }

    // PAGRINDINIS SUJUNGIMAS
    static void addBook(String title, String desc, String categoryName, int clientIdx) {
        //is kategorijos pavadinimo gaunam skaiciu - index
        int catIdx = getOrAddCategoryIndex(categories, categoryName);
        //vyksta tuo paciu metu tdl visi apraso SAME KNYGA
        bookTitles.add(title);
        bookDescriptions.add(desc);
        bookCategoryIndex.add(catIdx);
        bookClientIndex.add(clientIdx);
    }
    //eina per visas esamas kategorijas. Jei randa same>grazina jos index. Jei nerand>prided +grazin jos index
    static int getOrAddCategoryIndex(ArrayList<String> categories, String categoryName) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).equalsIgnoreCase(categoryName)) {
                return i;
            }
        }
        categories.add(categoryName);
        return categories.size() - 1; // GRAZINTA REIKSME VISADA INDEX
    }

    // -------------------- A) Bubble Sort --------------------
    static void bubbleSortClients() {
        for (int i = 0; i < clients.size() - 1; i++) {
            for (int j = 0; j < clients.size() - 1; j++) {

                if (clients.get(j).compareToIgnoreCase(clients.get(j + 1)) > 0) {

                    // 1) swap clients
                    String temp = clients.get(j);
                    clients.set(j, clients.get(j + 1));
                    clients.set(j + 1, temp);

                    // 2) update bookClientIndex (kad knygos neprarastu savo zmogaus)
                    //bookClientIndex.add(2);  -   knyga turi clients.get(2) = Aiste = knyga bibliotekoj
                    for (int b = 0; b < bookClientIndex.size(); b++) {
                        // PO KIEKVIENO SWAP - Jei knyga rode i sena Jona (j),DBR ji turi rodyt i new vieta (j+1)
                        if (bookClientIndex.get(b) == j) {
                            bookClientIndex.set(b, j + 1);
                        } else if (bookClientIndex.get(b) == j + 1) { //ir atvirksciai
                            bookClientIndex.set(b, j);                // TAIP ISSAUGOMAS RYSYS
                        }
                    }
                }
            }
        }
    }

    static void printClientsWithBooks() {
        System.out.println("\n=== A) Skaitytojai (surikiuoti) su knygomis ===");

        for (int c = 0; c < clients.size(); c++) {
            System.out.println("Skaitytojas: " + clients.get(c));

            boolean hasBooks = false;

            for (int b = 0; b < bookTitles.size(); b++) {
                if (bookClientIndex.get(b) == c) {
                    hasBooks = true;
                    String cat = categories.get(bookCategoryIndex.get(b));
                    System.out.println("  - Paimta: \"" + bookTitles.get(b) + "\" (" + cat + ")");
                }
            }

            if (!hasBooks) {
                System.out.println("  - (knygų neturi)");
            }
        }
    }
    // -------------------- B) Books by categories --------------------
    static void printBooksByCategories() {
        System.out.println("\n=== B) Knygos pagal kategorijas ===");

        for (int c = 0; c < categories.size(); c++) {
            System.out.println("KATEGORIJA: " + categories.get(c));

            boolean foundAny = false;

            for (int b = 0; b < bookTitles.size(); b++) {
                if (bookCategoryIndex.get(b) == c) {
                    foundAny = true;
                    System.out.println("  - " + bookTitles.get(b));
                }
            }
            if (!foundAny) {
                System.out.println("  - (knygų nėra)");
            }
        }
    }
    // -------------------- C) Search --------------------
    static void searchBooks(String query) {
        System.out.println("\n=== C) Paieška: \"" + query + "\" ===");

        String q = query.toLowerCase().trim();
        boolean found = false;

        for (int b = 0; b < bookTitles.size(); b++) {
            String title = bookTitles.get(b);
            String desc = bookDescriptions.get(b);
            String cat = categories.get(bookCategoryIndex.get(b));
            // tikrinam visur bet niekur nekeiciam, tik skaitom data
            boolean match =
                    title.toLowerCase().contains(q) ||
                            desc.toLowerCase().contains(q) ||
                            cat.toLowerCase().contains(q);
            if (match) {
                found = true;

                int clientIdx = bookClientIndex.get(b);
                String status = (clientIdx == -1)
                        ? "[bibliotekoje]"
                        : "[pas skaitytoją: " + clients.get(clientIdx) + "]";

                System.out.println("  - " + title + " (" + cat + ") " + status);
            }
        }
        if (!found) {
            System.out.println("Nieko nerasta");
        }
    }
}
//if (bookClientIndex.get(b) == c) > ar si knyga priklauso sitam klientui? >
//Jei c == 0 (Jonas): > visos knygos, kuriu bookClientIndex == 0, bus isspausdintos