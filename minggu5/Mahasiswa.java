package minggu5;

public class Mahasiswa {
    public String nama;
    public String nim;
    public int tahunMasuk;
    public double nilaiUTS;
    public double nilaiUAS;

    public Mahasiswa(String nama, String nim, int tahun, double uts, double uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahun;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

    public static Mahasiswa cariUTStertinggi(Mahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        Mahasiswa kiri = cariUTStertinggi(arr, l, mid);
        Mahasiswa kanan = cariUTStertinggi(arr, mid + 1, r);
        
        return (kiri.nilaiUTS > kanan.nilaiUTS) ? kiri : kanan;
    }

    public static Mahasiswa cariUTSterendah(Mahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        Mahasiswa kiri = cariUTSterendah(arr, l, mid);
        Mahasiswa kanan = cariUTSterendah(arr, mid + 1, r);
        
        return (kiri.nilaiUTS < kanan.nilaiUTS) ? kiri : kanan;
    }

    public static double hitungRataUAS(Mahasiswa arr[]) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}