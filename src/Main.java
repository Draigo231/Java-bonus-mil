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

        int bonusMiles; // кол-во бонусов при соблюдении условий автоперевозчика
        int bonusDivider = 20; // делитель для расчёта бонуса

        if (amount > bonusDivider) {
            bonusMiles = amount * 1 / bonusDivider;
        } else {
            bonusMiles = 0;
        }

        int bonus = bonusMiles;

        System.out.println("Общая стоимость билета: " + amount);
        System.out.println("Сумма начисленных бонусов:" + bonus);

    }
}
