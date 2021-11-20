package Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("AAAA/MM/DD HH:MM:SS --> "+dtf.format(LocalDateTime.now()));
    }

}
