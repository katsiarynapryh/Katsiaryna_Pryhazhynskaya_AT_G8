//package homework.day5;
//
//import java.time.Instant;
//import java.time.format.DateTimeFormatter;
//
//public class DateFormat
//{
//    //1.6 метод принимает на вход строку с датой и временем в формате "22.00 07.09.2020"
//    // и выводит в консоль в формате "September, 7, 2020 22:00"
//
//    public void dateFormat(String dateInput) {
//        DateTimeFormatter formatIn = DateTimeFormatter.ofPattern("HH.MM DD.MM.YYY");
//        Instant myDate = Instant.parse(dateInput, formatIn);
//
//        DateTimeFormatter formatOut = DateTimeFormatter.ofPattern("MMMM, DD, YYYY HH:MM");
//        String dateTimeOut = myDate.parse(formatOut);
//        System.out.println(dateTimeOut);
//    }
//}
