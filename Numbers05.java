import java.util.Arrays;

public class Numbers05 {
    public static void main(String[] args) {

        int[][] num = new int[3][];

        num[0] = new int[5];
        num[1] = new int[3];
        num[2] = new int[1];

        num[0][0] = 10;
        num[0][1] = 20;
        num[0][2] = 30;
        num[0][3] = 40;
        num[0][4] = 50;
        num[1][0] = 5;
        num[1][1] = 15;
        num[1][2] = 25;
        num[2][0] = 99;

        System.out.println("=== Cetak array per baris dengan Arrays.toString ===");
        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }

        System.out.println("\n=== Panjang setiap baris ===");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + num[i].length);
        }

        System.out.println("\n=== Cetak manual ===");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
