public class CycleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(" ");
            System.out.println(9 - i);
            //0 9
            //1 8
            //2 7
            //i+j=9 j=9-i
        }
        // for (int i=0; i<9;i++);
        for (int i = 0, j = 9; i < 10; i++) ;
        {
       //     System.out.print(j);
            System.out.println(" ");
        }
        for (int i = 0; i < 10; i++) {
            boolean b = i % 2 == 0;
            if (b) System.out.println(i);
        }
        for (int i = 0; i < 10; i++)
            if (i % 2 == 0)
                System.out.println(i);


    }
}
