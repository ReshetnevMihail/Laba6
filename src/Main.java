
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application
{

    public void start(Stage primaryStage)
    {

        CollectionF obj = new CollectionF();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числа: ");
        long a;
        double b;
        String c;
        for(int i = 0;i<10;i++) {
            a = in.nextInt();
            obj.FindNegative(a);
        }

        System.out.print("Введите числа: ");
        for(int i = 0;i<10;i++) {
            b = in.nextInt();
            obj.SumDuble(b);
        }


        System.out.print("Введите строку: ");
        c = in.next();
        obj.FindString(c);

    }
}
