import java.util.Scanner;

/**
 * Created by Olga on 01.07.2017.
 */
public class main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите Ваше имя");
       String name = sc.nextLine();

       System.out.println("Введите Ваш Город");
        String city = sc.nextLine();

        int age;
        while (true) {
            try {
                System.out.println("Какой Ваш Возраст");
                age = sc.nextInt();
                sc.nextLine();

                break;
            } catch(Exception e) {
                System.out.println("Ошибка ввода!");
                sc.nextLine();
            }
        }

        System.out.println("Какое Ваше Хобби");
        String hobby = sc.nextLine();

        System.out.println("Please choose display format: 1 - табличный формат, 2 - текстовый формат, 3 - другое ");
        int f = sc.nextInt();
        switch (f) {
            case 1: // Option #1 (tabular):
                System.out.printf("\n----------------\nИмя: %s \nГород: %s \nВозраст: %d \nХобби: %s\n----------------\n", name, city, age, hobby);
                break;
            case 2: // option #2 (text):
                System.out.printf("\n----------------\nЧеловек по имени %s живет в городе %s .\nЕму %d лет и его хобби %s.\n----------------\n", name, city, age, hobby);
                break;
            case 3: // Option #3 (other):
                System.out.printf("\n----------------\n%s - имя \n%s - город \n%d - возраст \n%s - хобби\n----------------\n", name, city, age, hobby);
                break;
        }

     //   System.out.println("Вариант 1: ");
     //   System.out.println("Имя: " + name);
     //   System.out.println("Город: " + city);
     //   System.out.println("Возраст: " + age);
     //   System.out.println("Хобби: " + hobby);
     //   System.out.println("******************");
     //   System.out.println();

     //   System.out.println("Вариант 2");
     //   System.out.println("Человек по имени " + name + " живет в городе " + city);
     //   System.out.println("Этому человеку " + age + " лет и любит он заниматься " + hobby);
     //   System.out.println("*******************");
     //   System.out.println();

     //   System.out.println("Вариант 3");
     //   System.out.println(name + " - Имя");
     //   System.out.println(city + " - Город");
     //   System.out.println(age + " - Возраст");
     //   System.out.println(hobby + " - Хобби");
     //   System.out.println("СПАСИБО");
     //   System.out.println();
    }

}