import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // int toadEyesCount = 0;          //Жабьи глаза
       // int ghoulTearsCount = 0;        //Слезы вурдалака
       // int ravenBonesCount = 0;        //Кости ворона
       // int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        boolean isContinue = true;
        while (isContinue == true) {
            System.out.println("Введите количество жабьих глаз");
            int toadEyesCount = new Scanner(System.in).nextInt();

            System.out.println("Введите количество слез вурдалака");
            int ghoulTearsCount = new Scanner(System.in).nextInt();

            System.out.println("Введите количество костей вороны");
            int ravenBonesCount = new Scanner(System.in).nextInt();

            System.out.println("Введите количество 3пельменей");
            int dumplingsCount = new Scanner(System.in).nextInt();

            if (toadEyesCount == 3 && ravenBonesCount == 1) {
                System.out.println("Вы можете приготовит Эликсир зоркости");
            }
            if (ravenBonesCount == 2 && dumplingsCount == 4) {
                System.out.println("Вы можете приготовит Эликсир стойкости");
            }
            if (ghoulTearsCount == 7 && dumplingsCount == 1 && toadEyesCount == 2) {
                System.out.println("Вы можете приготовит Эликсир скрытности");
            }
            if (ghoulTearsCount == 5 && dumplingsCount == 10 && toadEyesCount == 4 && ravenBonesCount == 3) {
                System.out.println("Вы можете приготовит Запретный элексир");
            } else {
                System.out.println("У вас недостаточное количество ингридиентов");
            }




       /* System.out.println("Введите количество жабьих глаз");
        int toadEyesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество слез вурдалака");
        int ghoulTearsCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество костей вороны");
        int ravenBonesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество костей пельменей");
        int dumplingsCount = new Scanner(System.in).nextInt();

        if (toadEyesCount == 3 && ravenBonesCount == 1){
            System.out.println("Вы можете приготовит Эликсир зоркости");
        }
        if(ravenBonesCount == 2 && dumplingsCount == 4){
            System.out.println("Вы можете приготовит Эликсир стойкости");
        }
        if(ghoulTearsCount == 7 && dumplingsCount == 1 && toadEyesCount == 2){
            System.out.println("Вы можете приготовит Эликсир скрытности");
        }
        if(ghoulTearsCount == 5 && dumplingsCount == 10 && toadEyesCount == 4 && ravenBonesCount == 3){
            System.out.println("Вы можете приготовит Запретный элексир");
        }
        else {
            System.out.println("У вас не хватает ингридиентов, чтобы приготовить элексир");
        }
*/
        /*System.out.println(toadEyesCount);
        System.out.println(ghoulTearsCount);
        System.out.println(ravenBonesCount);
        System.out.println(dumplingsCount);*/
        }
    }
}
