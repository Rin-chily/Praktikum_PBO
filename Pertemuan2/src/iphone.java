public class iphone {
    String color;
    String storage;

    public void nyala() {
        System.out.println("iPhone " + this.color + " menyala.");
    }
    public void mati() {
        System.out.println("iPhone " + this.color + " mati.");
    }
    public void berdering() {
        System.out.println("iPhone " + this.color + " berdering.");
    }
    public void videoCall() {
        System.out.println("iPhone " + this.color + " melakukan video call.");
    }
    public void info() {
        System.out.println("Warna: " + this.color + ", Storage: " + this.storage);
    }

    // ini method main untuk menjalankan program
    public static void main(String[] args) {
        iphone iphone = new iphone();
        iphone iGreen = new iphone();
        iphone iGrey = new iphone();
        iphone iDarkGrey = new iphone();

        iphone.color = "Gold";
        iGreen.color = "Green";
        iGrey.color = "Grey";
        iDarkGrey.color = "Dark Grey";

        iphone.storage = "64GB";
        iGreen.storage = "128GB";
        iGrey.storage = "512GB";
        iDarkGrey.storage = "64GB";

        // coba panggil method
        iphone.info();
        iphone.nyala();
        iGreen.info();
        iGreen.berdering();
    }    
}
