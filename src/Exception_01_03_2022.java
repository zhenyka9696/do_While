import java.util.Scanner;

public class Exception_01_03_2022 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{System.out.println("Input the integer value");}
        while(scanner.nextInt()!=-1);
        //while (scanner.nextInt()!=-1)
        //{System.out.println("Input the integer value");}
        Person person=new Person("noname");
        System.out.println(person.getName());
    }
}

        class Person {
    private String name;
            public Person(String name) {
                this.name = name;
            }

          //  String name;

            public String getName() {
                return name;
            }
        }