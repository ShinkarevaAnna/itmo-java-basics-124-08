package Itmo.lessons4.Part1;

public class Share {
    public static void divisibilityCheck(){
        int i3 =0;
        int i5 = 0;
        int i35 = 0;
        int x = 0;
        System.out.print( "Делится на 3: ");
        while (x  < 100 && i3 + 3 <=100) {
            System.out.print((i3 = i3 +3) + ",");
            x++;
        }
        System.out.println();
        System.out.print( "Делится на 5: ");
        while (x  < 100 && i5 + 5 <=100) {
            System.out.print((i5 = i5 + 5) + ",");
            x++;
        }
        System.out.println();
        System.out.print( "Делится на 3 и на 5: ");
        while (x<100 && i35 + 15 <= 100) {
            System.out.print((i35 = i35 + 15) + ",");
            x++;
        }
  }
    public static void main(String[] args) {
        divisibilityCheck();
    }
}
