public class mobil {
    String warna;
    String tipe;

    public void nyalakanmesin() {
        System.out.println("Mobil " + this.warna + " nyalakan mesin.");
    }
    public void matikanmesin() {
        System.out.println("Mobil " + this.warna + " matikan mesin.");
    }
    public void klakson() {
        System.out.println("Mobil " + this.warna + " membunyikan klakson.");
    }
    public void info() {
        System.out.println("Warna: " + this.warna + ", Merk: " + this.tipe);
    }

public static void main(String[] args) {
        mobil Bmw = new mobil();
        mobil Sedan = new mobil();
        mobil jeep = new mobil();

        Bmw.warna = "hitam";
        Sedan.warna = "putih";
        jeep.warna = "Grey";
    
        Bmw.tipe = "Bmw";
        jeep.tipe = "jeep";
        Sedan.tipe = "sedan";
        // coba panggil method
        Bmw.info();
        Bmw.nyalakanmesin();
        jeep.info();
        jeep.matikanmesin();
    }
    
}
