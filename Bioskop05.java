public class Bioskop {
    public static void main(String[] args) {

        String[][] penonton = {
                {"Adit", "Budi"},
                {"Citra", "Dewi"},
                {"Eko", "Fani"},
                {"Gilang", "Hana"}
        };

        System.out.println("=== Daftar Penonton ===");
        for (String[] row : penonton) {
            System.out.println(String.join(" | ", row));
        }

        System.out.println("\n=== Panjang Setiap Baris (For Loop) ===");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Baris " + i + ": " + penonton[i].length);
        }

        System.out.println("\n=== Panjang Setiap Baris (Foreach Loop) ===");
        int index = 0;
        for (String[] row : penonton) {
            System.out.println("Baris " + index + ": " + row.length);
            index++;
        }

        System.out.println("\n=== Penonton Baris ke-3 (For Loop) ===");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.print(penonton[2][i] + " ");
        }
        System.out.println();

        System.out.println("\n=== Penonton Baris ke-3 (Foreach Loop) ===");
        for (String nama : penonton[2]) {
            System.out.print(nama + " ");
        }
        System.out.println();

        System.out.println("\n=== Semua Baris Penonton ===");
        int baris = 0;
        for (String[] row : penonton) {
            System.out.println("Baris " + baris + ": " + String.join(", ", row));
            baris++;
        }
    }
}
