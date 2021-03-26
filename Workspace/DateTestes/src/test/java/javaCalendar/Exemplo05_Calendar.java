package javaCalendar;

import java.util.Calendar;

// Exemplo de utilização da classe Calendar
public class Exemplo05_Calendar {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();

        System.out.println(agora);

        /*
        *java.util.GregorianCalendar[
        * time=1616775889512,areFieldsSet=true,areAllFieldsSet=true,
        * lenient=true,zone=sun.util.calendar.ZoneInfo[
        * id="America/Sao_Paulo",offset=-10800000,dstSavings=0,
        * useDaylight=false,transitions=93,lastRule=null],
        * firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
        * YEAR=2021,
        * MONTH=2,
        * WEEK_OF_YEAR=13,
        * WEEK_OF_MONTH=4,
        * DAY_OF_MONTH=26,
        * DAY_OF_YEAR=85,
        * DAY_OF_WEEK=6,
        * DAY_OF_WEEK_IN_MONTH=4,
        * AM_PM=1,
        * HOUR=1,
        * HOUR_OF_DAY=13,
        * MINUTE=24,SECOND=49,MILLISECOND=512,
        * ZONE_OFFSET=-10800000,DST_OFFSET=0]
         * */
    }
}
