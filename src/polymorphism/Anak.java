package polymorphism;

public class Anak extends OrangTua {
    public Anak(){
       super(40d);
        System.out.println("konstruktor kosong");
    }


    @Override
    public void bayaran(){
        System.out.println("bayaran dari kelas anak");
    }

    public static void bayaran(int bayar){
        System.out.println("bayar sebanyak :"+bayar);
    }

    public static void bayaran(String bayar){
        System.out.println("bayara sebanyak :"+bayar);
    }
}
