package HomeworkSecondWeek;

public class Main {
    public static void main(String[] args) {
        Telefonlar telefon =  new Telefonlar();
        System.out.println("Cep Telefonu Fabrikası");
        System.out.println("--------------------------------------");
        System.out.println("Tüm ürünlere ait özellikler: ");
        telefon.aramaYap();
        telefon.mesajGönder();
        telefon.klavyeKullan();

        System.out.println("----------------------------------------");

        System.out.println("Ürün-1: Samsung Telefon");
        Samsung samsung = new Samsung();
        samsung.setModelAdi("GalaxyS8");
        samsung.setNoIMEI(123456789);
        samsung.setVersiyonNo("C4895");
        samsung.setBellekKapasitesi(2048);
        samsung.setEkranBoyutu(5.6);
        System.out.println("Samsung "+ samsung.toString());
        samsung.dosyaPaylasim();
        samsung.mp3Dinletisi();
        samsung.klavyeKullan();

        System.out.println("--------------------------------------------");

        System.out.println("Ürün-2: Apple Telefon");
        Apple apple = new Apple();
        apple.setModelAdi("Iphone12Pro");
        apple.setNoIMEI(987654321);
        apple.setVersiyonNo("A1920");
        apple.setBellekKapasitesi(4096);
        apple.setEkranBoyutu(6.1);
        System.out.println("Apple "+ apple.toString());
        apple.goruntuluGorusme();
        apple.ekranPaylasim();
        apple.klavyeKullan();





    }

}
