package org.example;

// JAVA YRA TIK 1 LYGIO PAVELDEJIMAS - VIENU METU 1 CLASS (veliau-interface leidzia implement jau kelis)
public class Ebook extends Publication{
    private String format;
    private int sizeMB;
    //construktorius
    public Ebook(String title, double price, String format, int sizeMB){
        super(title, price);
        this.format=format;
        this.sizeMB=sizeMB;
    }
    //override
    @Override
    public String getDeliveryInfo(){
        return "Ebook dwnld"+format+".Size"+sizeMB;
    }
}
