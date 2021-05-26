/*Модифікувати лабораторну роботу №3 наступним чином: для літер, слів, речень, розділових знаків та тексту створити
окремі класи. Слово повинно складатися з масиву літер, речення з масиву слів та розділових знаків,
 текст з масиву речень.
 */
package lab5;

public class lab5 {
    public static void main(String[] args) {
        Text text = new Text("Hello  world!I am Alona.     Today is a good day. The sun is walking the birds are singing.");
        System.out.println(text);
        System.out.println(text.sortedToString());
    }
}
