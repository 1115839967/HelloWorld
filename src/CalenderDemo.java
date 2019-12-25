import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
    public static void main(String[] args) {

        /*Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 1-1);
        Date date = calendar.getTime();
        System.out.println(date);*/

        /*Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        System.out.println(calendar.getMaximum(Calendar.DAY_OF_WEEK));*/

//        Calendar.getInstance().get(Calendar.YEAR);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        System.err.println(calendar);
//        Calendar instance = Calendar.getInstance();
//        instance.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
//        Date now = new Date();
//        System.out.println(now.getDate());




//        LocalDate today = LocalDate.now();
//            today.adjustInto(TemporalAdjusters.fi)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate=null;
        LocalDate endDate=null;

        LocalDate today = LocalDate.of(2019, 12, 6);
        try {
            LocalDate activityStartDate = LocalDate.parse("2019-07-31", dateTimeFormatter);
            LocalDate nextMonthDate = activityStartDate.plusMonths(1);
            boolean isInRange = (today.isAfter(activityStartDate) || today.equals(activityStartDate))
                    && (today.isBefore(nextMonthDate) || today.equals(nextMonthDate));
            if (isInRange) {
                startDate = activityStartDate;
                endDate = nextMonthDate;
            } else {
                startDate = nextMonthDate;
                LocalDate plusDate = nextMonthDate;
                do{
                    plusDate=plusDate.plusMonths(1);
                }while (today.isAfter(plusDate));
                endDate=plusDate;
                startDate=endDate.minusMonths(1);
            }
        }catch (DateTimeParseException e){
            e.getStackTrace();
        }

        LocalDateTime of1 = LocalDateTime.of(startDate, LocalTime.now());
        ZonedDateTime zonedDateTime1 = of1.atZone(ZoneId.systemDefault());
        Date from1 = Date.from(zonedDateTime1.toInstant());
        System.out.println(from1);

        LocalDateTime of2 = LocalDateTime.of(endDate, LocalTime.parse("00:00:00"));
        ZonedDateTime zonedDateTime2 = of2.atZone(ZoneId.systemDefault());
        Date from2 = Date.from(zonedDateTime2.toInstant());
        System.out.println(from2);



    }
}
