package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String slashDate = today.format(fmt);

        DateTimeFormatter fmt2 =
                DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String dashDate = today.format(fmt2);

        DateTimeFormatter fmt3 =
                DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String writtenDate = today.format(fmt3);


        DateTimeFormatter fmt4 =
                DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm");
        String writtenDateAndTime = today.format(fmt4);

        System.out.println(slashDate);
        System.out.println(dashDate);
        System.out.println(writtenDate);
        System.out.println(writtenDateAndTime);

    }
}
