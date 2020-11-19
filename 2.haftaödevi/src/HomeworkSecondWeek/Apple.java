package HomeworkSecondWeek;

import HomeworkSecondWeek.Telefonlar;

public class Apple extends Telefonlar {

    public void goruntuluGorusme(){

        System.out.println("Sadece Apple telefonlar ile GÖRÜNTÜLÜ GÖRÜŞME yapabilirsiiz.");
    }

    public void ekranPaylasim(){
        System.out.println("Sadece Apple telefonlar ile EKRAN PAYLAŞIMI yapabilirsiniz. ");
    }

    @Override
    public void klavyeKullan() {
        System.out.println("Apple telefonlarda DOKUNMATİK KLAVYE kullanılmaktadır. ");
    }
}
