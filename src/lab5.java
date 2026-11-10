import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        // сканер для клав-ры
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для перевода в camelCase: ");
        // nextLine(), чтобы считать всю строку с пробелами
        String inputStr = scanner.nextLine();

        // Разбиваем строку на массив слов по любым пробелам
        String[] words = inputStr.split("\\s+");

        //S++ - разбивает строку по пробелам, нормально обрабатывая ситуации, когда между словами стоит несколько пробелов подряд



                // StringBuilderдля сборки новой строки из кусочков
        StringBuilder result = new StringBuilder();

        // Перебираем все полученные слова по очереди
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Пропускать пустые символс
            if (word.isEmpty()) {
                continue;
            }

            if (i == 0) {
                // Самое первое слово в camelCase всегда пишется полностью маленькими буквами
                result.append(word.toLowerCase());
            } else {
                // У остальных слов первую букву делаем заглавной, а хвост — маленьким
                String firstChar = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();

                result.append(firstChar).append(restOfWord);
            }
        }

        // Выводим итоговый результат
        System.out.println("\n--- Результат преобразования ---");
        System.out.println("Итог: " + result.toString());


        scanner.close();
    }
}
