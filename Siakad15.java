import java.util.Scanner;

public class Siakad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int j;
        float nilai, totalNilai = 0, rataNilai;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Input nilai mahasiswa ke " + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke- " + j + " = ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai Mahasiswa ke " + i + " adalah " + rataNilai);
        }
        sc.close();
    }
}
