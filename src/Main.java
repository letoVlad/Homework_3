public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int people = 18;
        if (people >=  18) {
            System.out.println("Поздравляю,с Совершенолетием");
        } else {
            System.out.println("Вам стоит ещё подождать");
        }

        System.out.println("---------------");
        System.out.println("Задание 2");
        int Mark = 24;
        if (Mark >= 7 && Mark <= 17) {
            System.out.println("Mark ходить в школу");
        } else if (Mark >= 18 && Mark <= 23) {
            System.out.println("Mark закончил школу и учиться в университете");
        } else if (Mark >= 24)
            System.out.println("Mark окончил университет и идет на работу");

        System.out.println("---------------");
        System.out.println("Задание 3");
        int Capacity = 102;
        int seatsCount = 50;
        int otherCount = seatsCount - Capacity;

        int seatsUsed = 65;
        int otherUsed = 22;
        if (seatsUsed < otherUsed) {
            System.out.println("Есть ещё" + (seatsUsed - seatsCount) + " сидячих мест");
        } else {
            System.out.println("Сидящих мест нет");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть ещё " + (seatsCount - otherUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }

        System.out.println("---------------");
        System.out.println("Домащнее задание - 3");
        System.out.println("Задание 1");
        int human = 25;

        if (human >= 2 && human <= 6) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в детский сад");
        } else if (human >= 7 && human <= 18) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в школу");
        } else if (human >= 18 && human <= 24) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в университет");
        } else if (human >= 25) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить на работу");
        }

        System.out.println("---------------");
        System.out.println("Домащнее задание - 3");
        System.out.println("Задание 2");

        int children = 15;
        if (children <= 5) {
            System.out.println("Ребенок не может кататься на атракционах");
        } else if (children > 5 && children < 14) {
            System.out.println("Можно кататься только с сопровождении взрослого");
        } else if (children >= 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        System.out.println("---------------");
        System.out.println("Домащнее задание - 3");
        System.out.println("Задание 3");
        int one = -9;
        int two = 6;
        int thee = 6;
        if (one > two && one > thee) {
            System.out.println(one);
        } else if (two > one && two > thee) {
            System.out.println(two);
        } else {
            System.out.println(thee);
        }
    }
}
