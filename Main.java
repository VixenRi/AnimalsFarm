public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal a = SelectAnimal.select(" Рыжик ,", "Пони");
        try {
            System.out.println(a.name);

            a.walk();
            a.sleep();
            a.eat();

        System.out.println(" ");

            Animal b = SelectAnimal.select(" Снежик ,", "кот");
        System.out.println(b.name);

        b.walk();
        b.sleep();
        b.eat();

            System.out.println(" ");

            Animal c = SelectAnimal.select(" Шарик ,", "собака");
            System.out.println(c.name);

            c.walk();
            c.sleep();
            c.eat();

            System.out.println(" ");




        } catch (Exception e) {
                System.out.println("такого животного нет");
            }



        }
    }

