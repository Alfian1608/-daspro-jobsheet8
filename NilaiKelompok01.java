import java.util.Scanner;
public class NilaiKelompok01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Kelompok : ");
        int jumlahkelompok = sc.nextInt();
        System.out.print("Masukan Jumlah Penilai: ");
        int jumlahpenilai = sc.nextInt();

        if (jumlahkelompok <= 0 || jumlahpenilai <= 0) {
            System.out.println("Jumlah Kelompok dan Penilai Harus > 0.");
        } else {
            int nomorkelompok = 1;
            double ratatertinggi = -1;
            int kelompokterbaik = 0;

            while (nomorkelompok <= jumlahkelompok) {
                System.out.println("Kelompok " + nomorkelompok);
                double totalnilai = 0;

                for (int j = 1; j <= jumlahpenilai; j++) {
                    int nilai;
                    do {
                        System.out.print(" Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalnilai += nilai;
                }

                double ratanilai = totalnilai / jumlahpenilai;
                System.out.println(" Kelompok " + nomorkelompok + (": Nilai rata-rata = " + ratanilai));

                if (ratanilai > ratatertinggi) {
                    ratatertinggi = ratanilai;
                    kelompokterbaik = nomorkelompok;
                }
                nomorkelompok++; 

                }
                System.out.println("==============================");
                System.out.println("Kelompok Terbaik   :" + kelompokterbaik);
                System.out.println("Rata-rata Tertinggi:" + ratatertinggi);
            }
            sc.close();
        }
    }