public class Cycle {
    public static void main(String[] args) {

        for (int i=1; i<=9; i++)
            System.out.println(i);
        for(int i=1; i>1; i++)
            System.out.print("hi");
        for (int i=1;i<=9;i++)

            System.out.print(i);
            System.out.println();
            for (int i=1;i<9;i++)
            {
                System.out.print(i);
            }
        System.out.println();
            for (int i=9;i >=0;i--)
                System.out.println(i);
            
            for(int i=1;i<12;i++)
            {
                System.out.println(i);
                int a=0;
                i+=a;
                a++;
            }
    }
}
