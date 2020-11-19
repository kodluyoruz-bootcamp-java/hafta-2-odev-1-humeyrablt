package HomeworkSecondWeek;

import HomeworkSecondWeek.Telefonlar;

public class Samsung extends Telefonlar {

    public void dosyaPaylasim(){

        System.out.println("Sadece Samsung telefonlar ile DOSYA PAYLAŞIMI yapabilirsiniz. ");
    }
    public void mp3Dinletisi(){

        System.out.println("Sadece Samsun telefonlar ile MP3 dinleyebilirsiniz.");
    }

    @Override
    public void klavyeKullan() {
        System.out.println("Samsung telefonlarda TUŞLU KLAVYE kullanılmaktadır. ");
    }
}
