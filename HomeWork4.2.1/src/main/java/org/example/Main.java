package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Logger logger = Logger.getInstance();
        //...
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        list = arrayListRandom();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        Filter filter = new Filter(Integer.parseInt(scanner.nextLine()));
        List<Integer> resultList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (int i : resultList) {
            System.out.print(i + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");

    }

    public static List<Integer> arrayListRandom() {
        List<Integer> list = new ArrayList<>();
        System.out.print("Введите размер списка: ");
        int sizeArray = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите верхнюю границу для значений: ");
        int maxNumber = Integer.parseInt(scanner.nextLine());
        Logger logger = Logger.getInstance();
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < sizeArray; i++) {
            list.add(new Random().nextInt(maxNumber));
        }
        System.out.print("Вот случайный список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        return list;

    }
}