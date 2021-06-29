package SoalNo1;

public class TumpukanApp {
     public static void main(String[] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.masuk(7);
        tumpukan.baca();
        tumpukan.masuk(2);
        tumpukan.baca();
        tumpukan.masuk(3);
        tumpukan.baca();
        long nilai1 = tumpukan.pilih();
        System.out.println("nilai teratas  = " +nilai1);
        System.out.println("Nama saya adalah Fattarizky Akbar Faturohman");
        long nilai2=tumpukan.buang();
        System.out.println("nilai yang dihapus  = " +nilai1);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.masuk(4);
        tumpukan.baca();
    }
    
}
