package banco;
import java.time.LocalDate;
public final class Customer {
  private final String name;
  private final int id;
  private final String cpf;
  private final Birth birth;
  private int number;
  
  public Customer(String name, int id, String cpf, Birth birth, int number) {
    this.name = name;
    this.id = id;
    this.cpf = cpf;
    this.birth = birth;
    this.number = number;
  }
  
  public String getName() {
    return name;
  }
  
  public int id() {
    return id;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  public String getBirth() {
    return birth;
  }
  public int getAge() {
    return birth.until(LocalDate.now()).getYears();
  }
  
  public int getNumber() {
    return number;
  }
  public void setNumber(int number) {
    this.number = number;
  }
}
