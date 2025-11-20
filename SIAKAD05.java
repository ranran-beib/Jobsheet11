import java.util.Scanner;

public class SIAKAD05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        System.out.println("=== Input Nilai Mahasiswa ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Rata-Rata Nilai Setiap Mahasiswa ===");

        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j];
            }

            double rata = totalPerSiswa / nilai[i].length;
            System.out.println("Rata-rata mahasiswa ke-" + (i + 1) + ": " + rata);
        }

        System.out.println("\n========================================");
        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah:");
        
        for (int j = 0; j < 3; j++) {       // 3 mata kuliah
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {   // 4 mahasiswa
                totalPerMatkul += nilai[i][j];
            }

            double rataMatkul = totalPerMatkul / 4;
            System.out.println("Mata Kuliah " + (j + 1) + ": " + rataMatkul);
        }

        sc.close();
    }
}
