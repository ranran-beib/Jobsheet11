import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b, k;
        String nm, next;

        String[][] viewer = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nm = sc.nextLine();

            System.out.print("Masukkan baris: ");
            b = sc.nextInt();

            System.out.print("Masukkan kolom: ");
            k = sc.nextInt();
            sc.nextLine();

            viewer[b - 1][k - 1] = nm;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\n=== Data Penonton ===");
        for (int i = 0; i < viewer.length; i++) {
            for (int j = 0; j < viewer[i].length; j++) {
                System.out.print(viewer[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
