public class MahasiswaFILKOM extends manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String angkatan = nim.substring(0, 2);  // Digits 1-2 untuk angkatan
        char prodiCode = nim.charAt(4); // Digit ke-7 untuk prodi
        
        String[] prodiList = {"Teknik Informatika", "Teknik Komputer", "Sistem Informasi", 
                              "Unknown Prodi", "Pendidikan Teknologi Informasi", "Teknologi Informasi"};
        String prodi = prodiList[Character.getNumericValue(prodiCode)];

        return prodi + ", " + "20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        }
        return 0;
    }
    public String toString() {
        String infoBeasiswa;
        if (getBeasiswa() > 0) {
            infoBeasiswa = "Mendapat beasiswa sebesar $" + getBeasiswa();
        } else {
            infoBeasiswa = "Tidak mendapat beasiswa";
        }
    
        return super.toString() +
               "\nnim : " + nim +
               "\nipk : " + ipk +
               "\nstatus : " + getStatus() +
               "\nbeasiswa : " + infoBeasiswa;
    }
    // setter getternya
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
}

