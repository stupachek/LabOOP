//StringBuilder
//Відсортувати слова заданого тексту, що починаються з голосних літер, за другою літерою.
public class lab3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("The National Technical University of - Ukraine \"Igor Sikorsky " +
                "Kyiv Polytechnic Institute\" (NTUU KPI) is    a major university to in Kyiv, Ukraine. " +
                "The institute was founded on      31    August 1898 as the Kiev Polytechnic Institute of Emperor Alexander Ⅱ.");

        String words_vowel_f = str.toString().replaceAll("\\b[^aAoOiIeEYyUu\\s]([a-zA-Z])+[^.,!]\\b\\s*", "");
        String[] words_arr = words_vowel_f.split("(\\s*([^a-zA-Z])+\\s*)");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words_arr.length; i++) {
            if (words_arr[0].length() == 1) {
                words_arr[0] = words_arr[i] + " ";
            }
            for (int j = i + 1; j < words_arr.length; j++) {
                if (words_arr[j].length() == 1) {
                    words_arr[j] = words_arr[j] + " ";
                }
                if (words_arr[i].charAt(1) > words_arr[j].charAt(1)) {
                    String t = words_arr[j];
                    words_arr[j] = words_arr[i];
                    words_arr[i] = t;
                }
            }
            result.append(words_arr[i]).append(" ");
        }
        System.out.println(result);
    }
}
