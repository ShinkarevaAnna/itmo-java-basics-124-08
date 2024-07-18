package Itmo.lessonOverloadConstructors;

public class Main {

    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       int num = 2;
       int num2 = 5;
       System.out.println(calculator.division(num, num2));
       System.out.println(calculator.division(898765L, 45678L));
       System.out.println(calculator.division(45.9, 65.0));
       System.out.println(calculator.multiplication(23.4, 32.6));
       System.out.println(calculator.multiplication(67, 87));
       System.out.println(calculator.multiplication(7654L, 78L));
       System.out.println(calculator.subtraction(6789054L, 654321L));
       System.out.println(calculator.subtraction(65.9, 43.2));
       System.out.println(calculator.subtraction(num2, num));
       System.out.println(calculator.sum(456,567));
       System.out.println(calculator.sum(87654321L, 876543907654L));
       System.out.println(calculator.sum(56.9,43.9));

       Prisoner prisoner = new Prisoner("John", 5);
       prisoner.setSkills(Skills.DIGGER);
       String description = prisoner.getSkills().getDescription();
       System.out.println(prisoner);
       System.out.println(description);
    }
}
