import java.util.Scanner;


public class BiQ {
    public static void main(String[] args) {
        System.out.println("ax^4 + bx^2 + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();
        System.out.print("c = ");
        float c = scanner.nextFloat();
        float D = (b * b) - 4 * a * c;
        if (D > 0) {
            boolean p1 = false;
            boolean p2 = false;
            double x1 = java.lang.Math.sqrt((-b + (java.lang.Math.sqrt(D))) / (2 * a));
            double x2 = java.lang.Math.sqrt((-b - (java.lang.Math.sqrt(D))) / (2 * a));
            if ((x1 <= 0) | (x1 >= 0)){
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + -x1);
                p1 = true;
            }
            if ((x2 <= 0) | (x2 >= 0)) {
                System.out.println("X3 = " + x2);
                System.out.println("X4 = " + -x2);
                p2 = true;
            }
            if ((!p1) & (!p2)) {
                System.out.println("Корней нет!");
            }
        }
        if (D == 0) {
            double ans1 = (-b / (2 * a));
            double ans2 = (-b / (2 * a));
            System.out.println("X1 = " + ans1);
            System.out.println("X2 = " + ans2);
        }

        if (D < 0) {
            System.out.println("Корней нет!");
        }
    }
}
