import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectionF
{

    void FindNegative(long a)
    {
        ArrayList<Long> col = new ArrayList<Long>();
        for(int i = 0;i<1;i++) {
            col.add(a);
            if(col.get(i)<0) {
                System.out.print("Индекс отрицательного числа: ");
                System.out.println(i);
            }
        }

    }

    double SumDuble(double a)
    {

        ArrayList<Double> col = new ArrayList<Double>();
        double sum = 0;
        for(int i = 0;i<1;i++) {
            col.add(a);
            sum += col.get(i);
        }
        sum = sum/2;
        return sum;
    }

    void FindString(String a)
    {
        Pattern p = Pattern.compile("([A-Z]\\w+)");
        Matcher m = p.matcher(a);
        while (m.find()) {
            System.out.println(m.group());
        }

    }

}
