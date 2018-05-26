package com.geekbrains.Home_Work_3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //1.Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
    //попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
    //указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
    //выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    //2.Создать массив из слов
    //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
    //        "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
    //        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если
    //слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    //apple – загаданное
    //apricot - ответ игрока
    //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    //Для сравнения двух слов посимвольно, можно пользоваться:
    //String str = "apple";
    //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    //Играем до тех пор, пока игрок не отгадает слово
    //Используем только маленькие буквы

    public static void main(String[] args) {
        zadacha_1();
        zadacha_2();
    }

    public static void zadacha_1(){
        boolean b = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте загаданное число от 0 до 9, у Вас три попытки.");
        do {
            Random random = new Random();
            int z = random.nextInt(10);
            for (int i = 0; i <3 ; i++) {
                System.out.print("Введите число: ");
                int a = scanner.nextInt();
                if (a == z){
                    i = 3;
                    System.out.println("Вы угадали.");
                }else {
                    if (a > z){
                        System.out.println("Указанное Вами число, больше чем загаданное.");
                    }else {
                        System.out.println("Указанное Вами число, меньше чем загаданное.");
                    }
                }
                if (i == 2){
                    System.out.println("Вы  не угадали.");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            System.out.print("Ответ: ");
            int c = scanner.nextInt();
            if (c == 0){
                b = true;
            }
        }
        while (!b);
        System.out.println("Игра окончена.До свидания!");
    }

    public static void zadacha_2(){

    }
}
