public class lab1 {
    /* Створити клас, який складається з виконавчого методу, що виконує обчислення значення функції  із зазначеним
    типом індексів (п.5), операціями (п.2 та п.4) та константою (п.3). Результатом виконання дії є єдине значення
    дійсного типу. Необхідно обробити всі виключні ситуації, що можуть виникнути під час виконання програмного коду.
    Всі змінні повинні бути описані та значення їх задані у виконавчому методі.
    Дія з матрицею С = Вт
  Операція O1 = "+";
     Операція O2 = "/";
     тип індексів i та j = "byte";
     */
    static final int a = 1;
    static final int n = 2;
    static final int b = 1;
    static final int m = 2;
    static final int C = 0;


    public static void main(String[] args) {
        byte i = (byte) a;
        byte j = (byte) b;
        double S = 0;
        if ((i <= -C && -C <= n) || (j <= 0 && m >= 0)) {
            System.out.println("Ділення на 0 неможливе!");

        } else {
            for (; i <= n; i++) {
                for (; j <= m; j++) {
                    S = S +  ((i / (float) j) / (i + C));
                }
            }
            System.out.println(S);
        }
    }

}
