/* 1) public class Main{
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("Harshini");
    }
} */

/* 2) public class Main{
    public static void main(String[] args){
        System.out.println(-5+8*6);
        System.out.println((55+9)%9 );
        System.out.println(20+(-3*5)/8);
        System.out.println(5+15/3*2-8%3);
    }
}
    */

/* 3) public class Main{
    public static void main(String[] args){
        double r=7;
        double area=3.14*r*r;
        double perimeter=2*3.14*r;
        System.out.println("Area of circle is: "+area);
        System.out.println("Perimeter of circle is: "+perimeter);
    
    }
}

*/

/* 4) import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String bin1 = sc.next();
        System.out.print("Input second binary number: ");
        String bin2 = sc.next();
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + result);
        sc.close();
    }
}
    */

/*5) import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary number is: " + binary);
        sc.close();
    }
}
    */

import java.util.Scanner;
public class Main {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int num = sc.nextInt();
        String hex = Integer.toHexString(num).toUpperCase();
        System.out.println("Hexadecimal number is : " + hex);
        sc.close();
    }
}