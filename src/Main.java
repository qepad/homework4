public class Main {
    public static void main(String[] args) {

        // task 1

        System.out.println("Задача 1");
        short age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        // task 2

        System.out.println("Задача 2");
        byte temp = -33;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }


        // task 3

        System.out.println("Задача 3");
        short speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }


        // task 4

        System.out.println("Задача 4");
        short ageTwo = 30;
        if (ageTwo >= 2 && ageTwo <= 6) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в детский сад");
        }
        if (ageTwo >= 7 && ageTwo <= 17) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в школу");
        }
        if (ageTwo >= 18 && ageTwo <= 24) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в универ");
        }
        if (ageTwo > 24) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить на работу");
        }


        // task 5

        System.out.println("Задача 5");
        short ageThree = 25;
        if (ageThree <= 5) {
            System.out.println("Если возраст ребенка равен " + ageThree + ", то ему нельзя кататься на аттракционе");
        }
        if (ageThree > 5 && ageThree <= 14) {
            System.out.println("Если возраст ребенка равен " + ageThree + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageThree > 14) {
            System.out.println("Если возраст ребенка равен " + ageThree + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }


        // task 6

        System.out.println("Задача 6");
        int takenPlaces = 102; // сколько мест в вагоне занято
        byte capacity = 102;
        byte seats = 60;
        byte seatsFree = (byte) (seats - takenPlaces);
        byte standingPlacesFree = (byte) (capacity - takenPlaces);

        boolean trainIsFull = takenPlaces >= capacity;
        if (trainIsFull) {
            System.out.println("Вагон полностью забит");
        } else {
            if (takenPlaces >= seats) {
                System.out.println("В вагоне сидячих мест нет, остались стоячие - " + standingPlacesFree + " шт");
            } else {
                System.out.println("В вагоне есть сидячие места - " + seatsFree + " шт и стоячие");
            }
        }


        // task 7

        System.out.println("Задача 7");
        int one;
        int two;
        int three;

        one = 123;
        two = 29762;
        three = 983;

        if (one > two && one > three) {
            System.out.println("Переменная one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Переменная two больше остальных");
        } else {
            System.out.println("Переменная three больше остальных");
        }

    }
}