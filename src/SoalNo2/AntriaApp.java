package SoalNo2;

public class AntriaApp {
     public static void main(String[] args) {
        Antrian newQueue = new Antrian(10);
        newQueue.masukantrian(7);
        newQueue.show();
        newQueue.masukantrian(8);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.buangantrian());
        System.out.println("Nama saya adalah = Fattarizky Akbar Faturohman");
        newQueue.show();
        System.out.println();
        newQueue.masukantrian(7);
        newQueue.show();
        newQueue.masukantrian(6);
        newQueue.show();
        System.out.println("nilai yang paling depan = "+newQueue.peek());
       
    }
    
}
