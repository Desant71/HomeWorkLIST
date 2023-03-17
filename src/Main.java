import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sales = new ArrayList<>();


        while (true) {
            System.out.println("Выберите операцию: \n1. Добавить\n2. Показать\n3. Удалить");
            String operation = scanner.next();

            switch (operation) {
                case "1": {
                    System.out.println("Какой товар хотите добавить?");
                    sales.add(scanner.next());
                    break;
                }
                case "2": {
                    method(sales);
                    break;
                }
                case "3": {
                    method(sales);
                    System.out.println("Желаете что-нибудь удалить? Введите номер продукта или его название");
                    String numberOrName = scanner.next();
                    try {
                        int index = Integer.parseInt(numberOrName) - 1;
                        sales.remove(index);
                    } catch (Exception e) {
                        sales.remove(numberOrName);
                    }
                    break;
                }
                default: {
                    System.out.println("Такой команды нет");
                }

            }
        }
    }

    private static void method(List<String> sales) {
        System.out.println("Список покупок:");
        for (int i = 0; i < sales.size(); i++) {
            int count = i + 1;
            System.out.println(count + "." + sales.get(i));
        }
    }
}