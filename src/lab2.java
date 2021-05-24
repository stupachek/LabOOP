/* Створити клас, який складається з виконавчого методу, що виконує обчислення значення функції  із зазначеним типом
індексів (п.5), операціями (п.2 та п.4) та константою (п.3). Результатом виконання дії є єдине значення дійсного типу.
 Необхідно обробити всі виключні ситуації, що можуть виникнути під час виконання програмного коду. Всі змінні повинні
  бути описані та значення їх задані у виконавчому методі.*Дія з матрицею С = Вт
Дія з матрицею С = Вт
Тип елементів матриці double
Дія з матрицею С Обчислити суму найбільших елементів в рядках матриці
з непарними номерами та найменших елементів в рядках матриці з парними
номерами
*/

class matrix {
    int n, m;
    double[][] matrixB;
    double[][] matrixC;
    boolean flag = true;


    matrix(int i, int j, double... var) {
        n = i;
        m = j;
        matrixB = new double[n][m];
        if (var.length < (n * m)) {
            System.out.println("Ви ввели замало значень!");
            flag = false;
            return;
        }

        int index = 0;
        for (int k = 0; k < n; k++) {
            for (int t = 0; t < m; t++) {
                matrixB[k][t] = var[index++];
            }
        }
        matrixC = new double[m][n];
        for (int k = 0; k < m; k++) {
            for (int t = 0; t < n; t++) {
                matrixC[k][t] = matrixB[t][k];
            }
        }

    }

    void result(double [][] matrix) {
        for (int t = 0; t < matrix.length; ++t) {
            for (int k = 0; k < matrix[t].length; ++k) {
                System.out.print(matrix[t][k] + " ");
            }
            System.out.println();
        }
    }

    double sum1() {
        double sum1 = 0;
        for (int i = 0; i < m; i = i + 2) {
            double max = matrixC[i][0];
            for (int j = 1; j < n; j++) {
                if (matrixC[i][j] > max) max = matrixC[i][j];
            }
            sum1 += max;
        }
        return sum1;
    }

    double sum2() {
        double sum2 = 0;
        for (int i = 1; i < m; i = i + 2) {
            double min = matrixC[i][0];
            for (int j = 1; j < n; j++) {
                if (matrixC[i][j] < min) min = matrixC[i][j];
            }
            sum2 += min;
        }
        return sum2;
    }

}


public class lab2 {
    public static void main(String[] args) {
        matrix B = new matrix(2, 3, 1, 6, 8,4, 5.12,0.13, 7,6,5,5,6,6);
        if (!B.flag)
            return;
        System.out.println("Початкова матриця В");
        B.result(B.matrixB);
        System.out.println("Транспонована матриця В (є матрицею С)");
        B.result(B.matrixC);
        double max = B.sum1();
        System.out.println("Сума найбільших елементів в рядках матриці з непарними номерами: " + max);
        double min = B.sum2();
        System.out.println("Сума найменших елементів в рядках матриці з парними номерами: " + min);


    }
}
