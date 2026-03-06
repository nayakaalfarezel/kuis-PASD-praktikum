public class DosenMain {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("5543", "Dr. Budi", 2015, "S3", "Informatika");

        dosen1.tampilkanInfo();

        dosen1.ubahProdi("Sistem Informasi");
        dosen1.ubahPendidikan("S3");

        System.out.println("Setelah perubahan:");
        dosen1.tampilkanInfo();
    }
}