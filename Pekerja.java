import java.time.LocalDate;

public class Pekerja extends manusia {
    private double gaji; //gaji pokokny
    private LocalDate tahunMasuk; //tgl mulai kerja tgl-th-bln 
    private int jumlahAnak; //jumlah anak pekerja 
 // constructor buat bikin objek Pekerja lengkap sama data turunannya dari manusia
    public Pekerja(double gaji, int tahunMasuk, int bulan, int tanggal, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);   // manggil constructor dari class manusia (nama, nik, jenisKelamin, menikah)
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, bulan, tanggal); //  bikin objek tanggal dari tahun, bulan, dan tanggal masuk kerja
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();

        if (lamaKerja <= 5) {
            return gaji * 0.05;
        } else if (lamaKerja <= 10) {
            return gaji * 0.10;
        } else {
            return gaji * 0.15;
        }
    }

    public double getGaji() {
        return gaji + getBonus() + (jumlahAnak * 20);
    }

    public double getGajiPokok() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String toString() {
        return super.toString()
                + "\ntahun masuk : " + tahunMasuk
                + "\njumlah anak : " + jumlahAnak
                + "\ngaji : " + getGaji();
    }
}
