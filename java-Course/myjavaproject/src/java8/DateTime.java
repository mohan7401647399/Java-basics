/*

    ✅ Modern Date-Time API (Java 8 and after)

        Package: java.time.*
        This is recommended now.

        Important classes:

        | Class               | Description            |
        | ------------------- | ---------------------- |
        | `LocalDate`         | date only (yyyy-MM-dd) |
        | `LocalTime`         | time only (HH\:mm\:ss) |
        | `LocalDateTime`     | date + time            |
        | `DateTimeFormatter` | formatting and parsing |




    1. LocalDate Example

import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        LocalDate customDate = LocalDate.of(2025,8,18);
        System.out.println(customDate);
    }
}



    2. LocalTime Example

import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime customTime = LocalTime.of(10, 30, 30);
        System.out.println(customTime);
    }
}



    3. LocalDateTime Example

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        LocalDateTime customeDate = LocalDateTime.of(2025, 8, 18, 10, 30, 30);
        System.out.println(customeDate);
    }
}




    4. DateTimeFormatter (Formatting)

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yy HH:mm:ss");

        String formatted = date.format(formatter);

        System.out.println(formatted);
    }
}

package java8;
 */