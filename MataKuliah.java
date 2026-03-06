public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;
    Dosen[] dosenPengampu;
    int jumlahDosen = 0;

    public MataKuliah(String kodeMK, String namaMK, int sks, int kapasitasDosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        dosenPengampu = new Dosen[kapasitasDosen];
    }
    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen Pengampu:");

        for (int i = 0; i < jumlahDosen; i++) {
            dosenPengampu[i].tampilkanInfo();
        }
    }
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2!");
        }
    }
    public void tambahDosen(Dosen dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
        } else {
            System.out.println("Kapasitas dosen penuh!");
        }
    }
}