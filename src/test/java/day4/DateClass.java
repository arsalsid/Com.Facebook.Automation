package day4;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());


        SimpleDateFormat simpleDate = new SimpleDateFormat("dd");
        String formattedDate = simpleDate.format(d);
        System.out.println(formattedDate );

        int Date = Integer.parseInt(formattedDate);
        System.out.println(Date);
    }
}
