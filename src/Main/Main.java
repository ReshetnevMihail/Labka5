package Main;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    public void start(Stage primaryStage)
    {

        int number,pow,High,Low;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = in.nextInt();
        System.out.print("Введите степень: ");
        pow = in.nextInt();

        ExceptionClass obj2 = new ExceptionClass();
        Pow obj = new Pow();
        System.out.print("Результат с рекурсией: ");
        System.out.println(obj.PowRecoursive(number, pow));
        System.out.print("Результат без рекурсии: ");
        System.out.println(obj.PowNoRecoursive(number, pow));
        System.out.print("Введите верхний придел: ");
        High = in.nextInt();
        System.out.print("Введите нижний придел: ");
        do {
            Low = in.nextInt();
            obj2.ExceptionOfSearch(Low,High);
        }while (Low >= High);
        System.out.println("Результат с рекурсией: ");
        obj.SetCounter(Low);
        obj.SearchSquareNumbersR(High,Low);
        System.out.println("Результат без рекурсии: ");
        obj.SearchSquareNumbers(High,Low);

    }

}
