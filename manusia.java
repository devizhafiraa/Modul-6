public class manusia {
    private String nama;
    private boolean jenisKelamin; // true = laki-laki dan untuk false = perempuan
    private String nik;
    private boolean menikah; //boolean udahu nikah apa masi belum
//constructor buat data awal
    public manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
//untuk ngitung tunjangan dari jenis kelami sama status yg menikah atau belum
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25; // laki-laki menikah
            } else {
                return 20; // perempuan menikah
            }
        }
        return 15; // kalau belum menikah
    }
// total pendapatan, smntara dari tunjangan aja
    public double getPendapatan() {
        return getTunjangan();
    }
//ini buat ngeprint info lengkapnya
    public String toString() {
        return "nama : " + nama + "\nnik : " + nik + "\njenisKelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\npendapatan : " + getPendapatan();
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
}
