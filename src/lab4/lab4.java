/*Створити клас із виконавчим методом, в якому створити масив з об’єктів класу визначеному варіантом (п. 2).
 Відсортувати масив, за одним з полів, за зростанням, а за іншим, за спаданням використавши при цьому стандартні
 засоби сортування. Всі змінні повинні бути описані та значення їх задані у виконавчому методі. Код повиненвідповідати
 стандартам JCC та бути детально задокументований.
 Визначити клас одяг, який складається як мінімум з 5-и полів.
*/

package lab4;

import java.util.Arrays;
import java.util.Comparator;

public class lab4 {
    public static void main(String[] args) {
        Clothes[] my_clo = {new Clothes(Sex.MALE, TypeClothes.BLOUSE, "blue", Style.FORMAL, Size.S, 1222),
                new Clothes(Sex.FEMALE, TypeClothes.CARDIGAN, "red", Style.FORMAL, Size.M, 1822),
                new Clothes(Sex.FEMALE, TypeClothes.DRESS, "orange", Style.SPORTY, Size.XL, 122),
                new Clothes(Sex.FEMALE, TypeClothes.DRESS, "pink", Style.SPORTY, Size.XL, 122),
                new Clothes(Sex.MALE, TypeClothes.VEST, "pink", Style.FORMAL, Size.S, 1222)};
        System.out.println("-------Before sorting------");
        for (Clothes x :
                my_clo) {
            System.out.println(x);

        }
        Arrays.sort(my_clo, Comparator.comparing(Clothes::getColor));

        System.out.println("-------After sorting------");
        for (Clothes x :
                my_clo) {
            System.out.println(x);

        }
        Arrays.sort(my_clo, Comparator.comparing(Clothes::getPrice).reversed());
        System.out.println("-------After sorting------");
        for (Clothes x :
                my_clo) {
            System.out.println(x);

        }


    }
}
