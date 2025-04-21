public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahunMasuk, int bulan, int tanggal, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getGaji() {
        double gajiPekerja = super.getGaji();
        return gajiPekerja + (super.getGajiPokok() * 0.10);
    }

    public String toString() {
        return super.toString()
                + "\ndepartemen : " + departemen;
    }
}
