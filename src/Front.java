import java.util.Scanner;


class Front {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        boolean point = false;
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (!point) {
                 first = 1;
                 second = 1;
                 System.out.print(first + " " + second + " ");
                 point = true;
            }
            second += first;
            first += second;
            System.out.print(second + " " + first + " ");
        }
    }
}

// git pull - принять все изменения с github.
// git add - добавить под управление git. (Теперь git видит наши файлы).
