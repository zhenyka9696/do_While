public class CycleFor1 {
    public static void main(String[] args) {
       //System.out.print();
        System.out.print("0,");
        for (int i=2; i<10;i+=2)
        {
            System.out.print(i);
            System.out.print(",");
            i--;
            System.out.print(i);
            System.out.print(",");}
    }
}
