import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        System.out.println("\t\t\t ***Добро пожаловать в лабораторию!***\n " +
                "\t\t ***Введите нужное количество ингридиентов!***");

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        boolean isCanCook = false;
        while (!isCanCook) {
            System.out.println("Введите количество жабьих глаз");
            toadEyesCount = new Scanner(System.in).nextInt();

            System.out.println("Введите количество слез вурдалака");
            ghoulTearsCount = new Scanner(System.in).nextInt();

            System.out.println("Введите количество костей вороны");
            ravenBonesCount = new Scanner(System.in).nextInt();

            System.out.println("Введите количество пельменей");
            dumplingsCount = new Scanner(System.in).nextInt();

            if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
                System.out.println("Вы можете приготовить Эликсир зоркости");
                isCanCook = true;
            }
            if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
                System.out.println("Вы можете приготовить Эликсир стойкости");
                isCanCook = true;
            }
            if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
                System.out.println("Вы можете приготовить Эликсир скрытности");
                isCanCook = true;
            }
            if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
                System.out.println("Вы можете приготовить Запретный эликсир");
                isCanCook = true;
            } else if (!isCanCook) {
                System.out.println("Вы не можете приготовить ни один эликсир");
            }



        /*boolean isCanCook = false;
        System.out.println("Введите количество жабьих глаз");
        toadEyesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество слез вурдалака");
        ghoulTearsCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество костей вороны");
        ravenBonesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество костей пельменей");
        dumplingsCount = new Scanner(System.in).nextInt();

        if (toadEyesCount >= 3 && ravenBonesCount >= 1){
            System.out.println("Вы можете приготовит Эликсир зоркости");
            isCanCook = true;
        }
        if(ravenBonesCount >= 2 && dumplingsCount >= 4){
            System.out.println("Вы можете приготовит Эликсир стойкости");
            isCanCook = true;
        }
        if(ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2){
            System.out.println("Вы можете приготовит Эликсир скрытности");
            isCanCook = true;
        }
        if(ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3){
            System.out.println("Вы можете приготовит Запретный элексир");
            isCanCook = true;
        }
        if (isCanCook == false){
            System.out.println("Вы не можете приготовить ни один эликсир");
        }*/

        /*System.out.println(toadEyesCount);
        System.out.println(ghoulTearsCount);
        System.out.println(ravenBonesCount);
        System.out.println(dumplingsCount);*/
        }
    }
}
