package enkapsulasi;

public class App {
    public static void main(String[] args) throws Exception {
        Person siswa1 = new Person();

        siswa1.setNama("Rin");
        siswa1.setUmur(18);
        siswa1.setAlamat("Depok");

        System.out.println(siswa1.getNama());
        System.out.println(siswa1.getUmur());
        System.out.println(siswa1.getAlamat());
        
    }
}
