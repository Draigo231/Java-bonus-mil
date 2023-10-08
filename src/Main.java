// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int amount = 13_676; // стоимость билета
        boolean isRegistered = true;

        int bonusMiles; // кол-во бонусов, если пользователь авторизирован 
        if (isRegistered) {
            bonusMiles = 20; 
        } else {
            bonusMiles = 0;
        }

        int bonus = amount * 1 / bonusMiles;

        System.out.println("Общая стоимость билета: " + amount);
        System.out.println("Сумма начисленных бонусов:" + bonus);

    }
}
