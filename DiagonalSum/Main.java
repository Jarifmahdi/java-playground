package DiagonalSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split(" ");
            for (int j = 0; j < n; j++)
                matrix[i][j] = Integer.parseInt(parts[j]);
        }

        int sum1 = 0;
        int sum2 = 0;
        int a = 0;
        int b = n - 1;

        for (int i = 0; i < n; i++) {
            sum1 += matrix[i][i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == a && j == b) {
                    sum2 += matrix[i][j];
                    a++;
                    b--;
                }
            }
        }
        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println(sum1 + sum2);
            } else {
                System.out.println(sum1 + sum2 - matrix[(n - 1) / 2][(n - 1) / 2]);
            }
        } else {
            System.out.println("Invalid array length");
        }

        sc.close();
    }
}