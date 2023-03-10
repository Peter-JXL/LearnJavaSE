package chapter5.section40Time;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestNewAndOld {
  public static void main(String[] args) {
    // Date -> Instant:
    Instant i = new Date().toInstant();
    // Calendar -> Instant
    Instant i2 = Calendar.getInstance().toInstant();
    // TimeZone -> ZoneId
    ZoneId z = TimeZone.getDefault().toZoneId();



    // ZonedDateTime -> long:
    ZonedDateTime zdt = ZonedDateTime.now();
    long t = zdt.toEpochSecond() * 1000;

    // long -> Date:
    Date date = new Date(t);

    // ZonedDateTime -> long -> Calendar
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.setTimeZone(TimeZone.getTimeZone(zdt.getZone().getId()));
    calendar.setTimeInMillis(zdt.toEpochSecond() * 1000);
  }
}
