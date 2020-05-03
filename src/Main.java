import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        float first = scanner.nextInt();
        System.out.print("Введите 2 число: ");
        float second = scanner.nextInt();
        Math math = new Math();
        System.out.println(math.sum(first, second));
        System.out.println(math.minus(first, second));
        System.out.println(math.umn(first, second));
        System.out.println(math.del(first, second));
        System.out.println(math.ostatok(first, second));
        System.out.println(math.Pi_numb());
    }
}


class Math {

    Math () {

    }

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
