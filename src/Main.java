import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        float first = scanner.nextInt();
        System.out.print("Введите 2 число: ");
        float second = scanner.nextInt();
        Robot robot = new Robot();
        robot.setNumber1(first);
        robot.setNumber2(second);
        robot.calc();
    }
}


class Math {


    float sum (float x, float y) {
        return x + y;
    }

    float minus (float x, float y) {
        return x - y;
    }

    float umn (float x, float y) {
        float n = x;
        for (int i = 1; y - i != 0; i++) {
            x += n;
        }
        return x;
    }

    float ostatok (float x, float y) {
        return x % y;
    }

    float del (float x, float y) { // классическое деление
        return x / y;
    }

    float Pi_numb () {
        return 3.1415926535f;
    }

}

class Robot extends Math{

    float first = 10;
    float second = 10;

    float setNumber1 (float numb) {
        first = numb;
        return  first;
    }

    float setNumber2 (float numb) {
        second = numb;
        return second;
    }

    void calc() {
        System.out.println(sum(first, second));
        System.out.println(minus(first, second));
        System.out.println(umn(first, second));
        System.out.println(del(first, second));

    }
}
