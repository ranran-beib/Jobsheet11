import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] viewer = new String[4][2];

        int menu;

        while (true) {

            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            if (menu == 1) {

                String nama;
                int baris, kolom;

                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("!! Baris atau kolom tidak tersedia. Coba lagi.");
                        continue;
                    }

                    if (viewer[baris - 1][kolom - 1] != null) {
                        System.out.println("!! Kursi ini sudah terisi oleh: "
                                + viewer[baris - 1][kolom - 1]);
                        System.out.println("Pilih kursi lain.\n");
                        continue;
                    }

                    viewer[baris - 1][kolom - 1] = nama;
                    System.out.println("Data berhasil disimpan!");
                    break;
                }
            }

            else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");

                for (int i = 0; i < viewer.length; i++) {
                    for (int j = 0; j < viewer[i].length; j++) {

                        if (viewer[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(viewer[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            }

            else if (menu == 3) {
                System.out.println("Terima kasih!");
                break;
            }

            else {
                System.out.println("Menu tidak valid!");
            }
        }

        sc.close();
    }
}
