package HomeworkSecondWeek;

public class Telefonlar {
    private String modelAdi;
    private long noIMEI;
    private  String versiyonNo;
    private int bellekKapasitesi;
    private double ekranBoyutu;

    public void aramaYap(){
        System.out.println("Tüm ürünlerde arama yapılabilir.");
    }
    public void mesajGönder(){
        System.out.println("Tüm ürünlerde sms gönderilebilir.");
    }

    public void klavyeKullan(){
        System.out.println("Tuşlu veya dokunmatik kılavye kullanılan telefonlar üretilmektedir.");
    }

    public String getModelAdi() {
        return modelAdi;
    }

    public void setModelAdi(String modelAdi) {
        this.modelAdi = modelAdi;
    }

    public long getNoIMEI() {
        return noIMEI;
    }

    public void setNoIMEI(long noIMEI) {
        this.noIMEI = noIMEI;
    }

    public String getVersiyonNo() {
        return versiyonNo;
    }

    public void setVersiyonNo(String versiyonNo) {
        this.versiyonNo = versiyonNo;
    }

    public int getBellekKapasitesi() {
        return bellekKapasitesi;
    }

    public void setBellekKapasitesi(int bellekKapasitesi) {
        this.bellekKapasitesi = bellekKapasitesi;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    @Override
    public String toString() {
        return "Telefon Özellikleri : {" +
                "Model Adı='" + modelAdi + '\'' +
                ",  IMEI numarası=" + noIMEI +
                ", Versiyon ='" + versiyonNo + '\'' +
                ", Bellek Kapasitesi=" + bellekKapasitesi +
                ", Ekran Boyutu=" + ekranBoyutu +
                '}';
    }
}
