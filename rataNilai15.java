import java.util.Scanner;

public class rataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while (i<=5) {
            int totalNilai = 0, nilaiMhs, rataNilai;
          for (int j=1; j<=5; j++) {
            System.out.print("Nilai ke-" + j + "= ");
            nilaiMhs = sc.nextInt();
            totalNilai+=nilaiMhs;
        }
        rataNilai=totalNilai/5;
        i++;
        }
    }
    
}
