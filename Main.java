public class Main {
    public static void main(String[] args) {
        System.out.println("==== DATA manusia ====");
        // 1. manusia test cases
        manusia lakiMenikah = new manusia("Ari Irham", "165150612345678", true, true);
        manusia perempuanMenikah = new manusia("Devi Zhafira", "165150612345679", false, true);
        manusia belumMenikah = new manusia("Verdi", "165150612345680", true, false);

        System.out.println("Data Laki-laki telah menikah:");
        System.out.println(lakiMenikah);
        System.out.println("\nData perempuan telah menikah:");
        System.out.println(perempuanMenikah);
        System.out.println("\nData lajang:");
        System.out.println(belumMenikah);

        System.out.println("\n==== DATA MAHASISWA FILKOM ====");
        // 2. MahasiswaFILKOM test cases
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("032110612345601", 2.9, "Nicholas Saputra", "16513444445701", true, true);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("235150612345602", 3.3, "Satria", "165150612345702", true, false);
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("24150612345603", 3.8, "Alya Augusta", "165150612345703", false, true);

        System.out.println("Mahasiswa - IPK < 3:");
        System.out.println(mahasiswa1);
        System.out.println("\nMahasiswa - IPK 3 - 3.5:");
        System.out.println(mahasiswa2);
        System.out.println("\nMahasiswa - IPK 3.5 - 4:");
        System.out.println(mahasiswa3);
        System.out.println("\n==== DATA PEKERJA ====");
        // 3. Pekerja test cases
        Pekerja pekerja1 = new Pekerja(5000, 2023, 2, 10, 2, "Reza Fahlevi Al Hadi", "165150612345801", true, true);
        Pekerja pekerja2 = new Pekerja(6000, 2016, 2, 15, 0, "Ballerina capucina", "165150612345802", false, false);
        Pekerja pekerja3 = new Pekerja(7000, 2005, 3, 20, 10, "Halilintar Amid sblom Qahtan rilis", "165150612345803", true, true);
        
            
        System.out.println("Pekerja - Lama bekerja 2 tahun, anak 2:");
        System.out.println(pekerja1);
        System.out.println("\nDetail Gaji Pekerja 1:");
        System.out.println("Nama            : " + pekerja1.getNama());
        System.out.println("Gaji Pokok      : $" + pekerja1.getGajiPokok());
        System.out.println("Tunjangan Status: $" + (pekerja1.isMenikah() ? (pekerja1.isJenisKelamin() ? 25 : 20) : 15));
        System.out.println("Tunjangan Anak  : $" + (pekerja1.getJumlahAnak() * 20) + " (" + pekerja1.getJumlahAnak() + " anak)");
        System.out.println("Tahun Masuk     : " + pekerja1.getTahunMasuk());
        System.out.println("Bonus Lama Kerja: $" + pekerja1.getBonus());
        System.out.println("Total Pendapatan: $" + pekerja1.getGaji());
        
        System.out.println("\nPekerja - Lama bekerja 9 tahun:");
        System.out.println(pekerja2);
        System.out.println("\nDetail Gaji Pekerja 2:");
        System.out.println("Nama            : " + pekerja2.getNama());
        System.out.println("Gaji Pokok      : $" + pekerja2.getGajiPokok());
        System.out.println("Tunjangan Status: $" + (pekerja2.isMenikah() ? (pekerja2.isJenisKelamin() ? 25 : 20) : 15));
        System.out.println("Tunjangan Anak  : $" + (pekerja2.getJumlahAnak() * 20) + " (" + pekerja2.getJumlahAnak() + " anak)");
        System.out.println("Tahun Masuk     : " + pekerja2.getTahunMasuk());
        System.out.println("Bonus Lama Kerja: $" + pekerja2.getBonus());
        System.out.println("Total Pendapatan: $" + pekerja2.getGaji());
        
        System.out.println("\nPekerja - Lama bekerja 20 tahun, anak 10:");
        System.out.println(pekerja3);
        System.out.println("\nDetail Gaji Pekerja 3:");
        System.out.println("Nama            : " + pekerja3.getNama());
        System.out.println("Gaji Pokok      : $" + pekerja3.getGajiPokok());
        System.out.println("Tunjangan Status: $" + (pekerja3.isMenikah() ? (pekerja3.isJenisKelamin() ? 25 : 20) : 15));
        System.out.println("Tunjangan Anak  : $" + (pekerja3.getJumlahAnak() * 20) + " (" + pekerja3.getJumlahAnak() + " anak)");
        System.out.println("Tahun Masuk     : " + pekerja3.getTahunMasuk());
        System.out.println("Bonus Lama Kerja: $" + pekerja3.getBonus());
        System.out.println("Total Pendapatan: $" + pekerja3.getGaji());
        
        System.out.println("\n==== DATA MANAGER ====");
        
        Manager manager = new Manager("Marketing", 7500, 2010, 1, 1, 3, "Abimana OEMJI Hellow", "165150612345901", true, true);

        System.out.println("Manager - Lama bekerja 15 tahun dengan gaji $7500:");
        System.out.println(manager);
        
        System.out.println("\n==== INFORMASI DETAIL MANAGER ====");
        System.out.println("Nama            : " + manager.getNama());
        System.out.println("Departemen      : " + manager.getDepartemen());
        System.out.println("Gaji Pokok      : $" + manager.getGajiPokok());
        System.out.println("Bonus Manager   : $" + (manager.getGajiPokok() * 0.10) + " (10% dari Gaji Pokok)");
        System.out.println("Bonus Lama Kerja: $" + manager.getBonus());
        System.out.println("Tunjangan       : $" + manager.getTunjangan());
        System.out.println("Tunjangan Anak  : $" + (manager.getJumlahAnak() * 20) + " (" + manager.getJumlahAnak() + " anak)");
        System.out.println("Total Pendapatan: $" + manager.getGaji());
        System.out.println("Tahun Masuk     : " + manager.getTahunMasuk());
    
    }
    }
