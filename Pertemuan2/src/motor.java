public class motor {
    String warna;
    String tipe;

    public void nyalakanmesin() {
        System.out.println("Motor " + tipe + " warna " + warna + " menyala.");
    }

    public void matikanmesin() {
        System.out.println("Motor " + tipe + " warna " + warna + " mati.");
    }

    public void info() {
        System.out.println("Tipe: " + tipe + ", Warna: " + warna);
    }


public static void main(String[] args) {
        
        motor Ninja = new motor();
        motor nmax = new motor();
        motor vario = new motor();

        Ninja.warna = "hitam";
        nmax.warna = "putih";
        vario.warna = "Grey";
    
        Ninja.tipe = "Ninja";
        nmax.tipe = "nmax";
        vario.tipe = "vario";

        // coba panggil method
        Ninja.info();
        Ninja.nyalakanmesin();
        vario.info();
        vario.matikanmesin();
    }
}
