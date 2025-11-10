/*

    ✅ What is java.time Package?
        java.time is a modern Date and Time API introduced in Java 8 to replace the old java.util.Date and java.util.Calendar classes.
        It is immutable, thread-safe, and much easier to use.


    🔹 Main Classes in java.time
        | Class Name            | Description                                        |
        | --------------------- | -------------------------------------------------- |
        | **LocalDate**         | Date only (yyyy-MM-dd)                             |
        | **LocalTime**         | Time only (HH\:mm\:ss)                             |
        | **LocalDateTime**     | Date + Time                                        |
        | **ZonedDateTime**     | Date + Time + Time Zone                            |
        | **Period**            | Difference between two dates (Years, Months, Days) |
        | **Duration**          | Difference between two times (seconds, nanos)      |
        | **DateTimeFormatter** | Formatting and parsing date/time                   |


    ✅ Why java.time is Better
        Immutable (no accidental changes)
        Easy to read and understand
        Supports time zones
        Cleaner code
        Built-in format/parse
    


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


 */
package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Set;

public class DateTime {
    public static void main(String[] args) {
        LocalDate ldate = LocalDate.now();
        System.out.println(ldate);
        System.out.println("plusDays : " + ldate.plusDays(10));
        System.out.println("atStartOfDay : " + ldate.atStartOfDay());
        System.out.println("plusWeeks : " + ldate.plusWeeks(5));
        System.out.println("getDayOfMonth : " + ldate.getDayOfMonth());
        System.out.println("getDayOfYear : " + ldate.getDayOfYear());
        System.out.println("getMonthValue : " + ldate.getMonthValue());
        System.out.println("getYear : " + ldate.getYear());
        System.out.println("getDayOfWeek : " + ldate.getDayOfWeek());
        System.out.println("getEra : " + ldate.getEra());
        System.out.println("lengthOfMonth : " + ldate.lengthOfMonth());
        System.out.println("lengthOfYear : " + ldate.lengthOfYear());
        System.out.println("atStartOfDay : " + ldate.atStartOfDay());
        System.out.println("isLeapYear : " + ldate.isLeapYear());
        System.out.println("minusDays : " + ldate.minusDays(5));
        System.out.println("minusMonths : " + ldate.minusMonths(2));
        System.out.println("minusWeeks : " + ldate.minusWeeks(5));
        System.out.println("minusYears : " + ldate.minusYears(5));

        LocalDateTime lDateTime = LocalDateTime.now();
        System.out.println("getDayOfMonth : " + lDateTime.getDayOfMonth());
        System.out.println("getDayOfYear : " + lDateTime.getDayOfYear());
        System.out.println("getHour : " + lDateTime.getHour());
        System.out.println("getMinute : " + lDateTime.getMinute());
        System.out.println("getYear : " + lDateTime.getYear());

        Set<String> zone = ZoneId.getAvailableZoneIds();
        System.out.println(zone.size());
        System.out.println(zone.isEmpty());
        System.out.println(zone.contains("asia"));

        Duration d = Duration.ofSeconds(10);
        System.out.println(d);

        Period p = Period.ofDays(1);
        System.out.println(p);
    }
}