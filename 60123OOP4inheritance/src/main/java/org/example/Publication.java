package org.example;

public class Publication {
    String title;
    double price;
    //construtorius
    public Publication(){} //tuscias constructorius
    public Publication(String title, double price){
        this.title=title;
        this.price=price;
    }
    //papildomi methodai kurie isves tamtikra info
    public String getDeliveryInfo(){
        return "Standart pub.delivery";
    }
    // GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //METHOD OVERLOADING - kviesti ta pati methoda su skirtingais
    //parametrais - ji galima perkrauti tik tada kai skiriasi parametrai
    //PERKROVIMAS - galima perkrauti tik toje pacioj klasej
    public String getInfo(){
        return title+". Price:" +price +getDeliveryInfo();
    }
    public String getInfo(boolean showPrice){
        if(showPrice){
            return getInfo();
        }else{
            return title+"|" +getDeliveryInfo();
        }
    }
    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
