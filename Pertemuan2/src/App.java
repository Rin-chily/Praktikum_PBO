public class App {
    public static void main(String[] args) {
        iphone iGold = new iphone();
        iphone iGreen = new iphone();
        iphone iGrey = new iphone();
        iphone iDarkGrey = new iphone();

        iGold.color = "Gold";
        iGreen.color = "Green";
        iGrey.color = "Grey";
        iDarkGrey.color = "Dark Grey";

        iGold.storage = "64GB"; 
        iGreen.storage = "128GB";
        iGrey.storage = "512GB";
        iDarkGrey.storage = "64GB";

        // coba panggil method
        iGold.info();
        iGold.nyala();
        iGreen.info();
        iGreen.berdering();
    }
}
