public class MataKuliahMain {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("345", "Dr. Andi", 2010, "S3", "Informatika");
        Dosen d2 = new Dosen("123", "Dr. Siti", 2012, "S3", "Sistem Informasi");

        MataKuliah mk = new MataKuliah("IF101", "Pemrograman Java", 3, 3);

        mk.tambahDosen(d1);
        mk.tambahDosen(d2);

        mk.tampilkanInfo();

        mk.ubahNamaMK("Pemrograman Berorientasi Objek");
        mk.ubahSKS(4);

        System.out.println("\nSetelah perubahan:");
        mk.tampilkanInfo();
    }
}