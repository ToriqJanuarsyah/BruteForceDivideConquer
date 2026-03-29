package minggu5;

public class MainMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        Mahasiswa mhsTertinggi = Mahasiswa.cariUTStertinggi(daftarMhs, 0, daftarMhs.length - 1);
        
        Mahasiswa mhsTerendah = Mahasiswa.cariUTSterendah(daftarMhs, 0, daftarMhs.length - 1);
        
        double rataUAS = Mahasiswa.hitungRataUAS(daftarMhs);

        System.out.println("=============================================");
        System.out.println("       HASIL ANALISIS DATA MAHASISWA         ");
        System.out.println("=============================================");
        
        System.out.println("A. MAHASISWA DENGAN UTS TERTINGGI (DC):");
        System.out.println("   Nama         : " + mhsTertinggi.nama);
        System.out.println("   NIM          : " + mhsTertinggi.nim);
        System.out.println("   Tahun Masuk  : " + mhsTertinggi.tahunMasuk);
        System.out.println("   Nilai UTS    : " + mhsTertinggi.nilaiUTS);
        
        System.out.println("\nB. MAHASISWA DENGAN UTS TERENDAH (DC):");
        System.out.println("   Nama         : " + mhsTerendah.nama);
        System.out.println("   NIM          : " + mhsTerendah.nim);
        System.out.println("   Tahun Masuk  : " + mhsTerendah.tahunMasuk);
        System.out.println("   Nilai UTS    : " + mhsTerendah.nilaiUTS);
        
 
        System.out.printf("\nC. RATA-RATA NILAI UAS (BRUTE FORCE): %.2f\n", rataUAS);
        System.out.println("=============================================");
    }
}