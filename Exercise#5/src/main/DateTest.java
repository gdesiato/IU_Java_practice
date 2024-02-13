package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTest {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);

        LocalDate d2 = LocalDate.of(2015, 2, 5);

        LocalDate d3 = LocalDate.now();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        
        // Date and Time
        System.out.println(LocalDateTime.of(2015, Month.JANUARY, 01, 6, 30).format(DateTimeFormatter.ISO_DATE_TIME));
        // Only Date
        System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE));
        // Only Time
        System.out.println(LocalTime.of(6,30).format(DateTimeFormatter.ISO_TIME));
    }

}
