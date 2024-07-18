package Itmo.lessonArrays.Part1;

public class Share {
    public static void divisibilityCheck(){
        int i3 = 0;
        int i5 = 0;
        int i35 = 0;
        System.out.print("Делится на 3: ");
        while ((i3 = i3 + 3) < 100) {
            System.out.print(i3 + ",");
        }
        System.out.println();
        System.out.print("Делится на 5: ");
        while ((i5 = i5 + 5) < 100) {
            System.out.print(i5 + ",");
        }
        System.out.println();
        System.out.print("Делится на 3 и на 5: ");
        while ((i35 = i35 + 15) < 100) {
            System.out.print(i35 + ",");
        }
  }
    public static void main(String[] args) {
        divisibilityCheck();
    }
}
