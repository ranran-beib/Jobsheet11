public class Tugas {
    public static void main(String[] args) {
        int[][] hasilSurvey = {
            {4, 3, 5, 2, 1, 5},
            {3, 4, 2, 4, 5, 3},
            {5, 5, 4, 4, 3, 2},
            {1, 2, 3, 4, 5, 1},
            {4, 4, 4, 4, 4, 4},
            {3, 2, 3, 2, 3, 2},
            {5, 5, 5, 5, 5, 5},
            {2, 3, 2, 3, 2, 3},
            {1, 1, 1, 1, 1, 1},
            {4, 3, 4, 3, 4, 3}
        };

        int jumlahResponden = hasilSurvey.length;
        int jumlahPertanyaan = hasilSurvey[0].length;

        System.out.println("Rata-rata nilai untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += hasilSurvey[i][j];
            }
            double rataRata = total / jumlahPertanyaan;
            System.out.printf("Responden %d: %.2f%n", i + 1, rataRata);
        }

        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += hasilSurvey[i][j];
            }
            double rataRata = total / jumlahResponden;
            System.out.printf("Pertanyaan %d: %.2f%n", j + 1, rataRata);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.printf("%nRata-rata nilai keseluruhan: %.2f%n", rataRataKeseluruhan);
    }
}
