package banco;
import java.time.LocalDate;
import java.time.Year;
import java.time.Month;
public final class Birth {
  private final int day;
  private final Month month;
  private final Year year;
  private final LocalDate fullDate;
  
  public Birth(int day, Month month, Year year) {
    this.day = day;
    this.month = month;
    this.year = year;
    this.fullDate = LocalDate.of(year.getValue(),month.getValue(),day);
  }
  
  public int getAge() {
    return fullDate.until(LocalDate.now()).getYears();
  }
  
  public int getDay() {
    return day;
  }
  
  public int getMonth() {
    return month.getValue();
  }
  
  public int getYear() {
    return year.getValue();
  }
  
  public LocalDate getFull() {
    return fullDate;
  }
}
