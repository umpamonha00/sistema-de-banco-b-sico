package banco;
import java.time.LocalDate;
public final class Account {
  private final int id;
  private String password;
  private double balance;
  private typeAccount type;
  private final Birth creationDate;
  private final Customer customer;
  
  public Account(int id, String password, typeAccount type, Birth creationDate, Customer customer) {
    this.id = id;
    this.password = password;
    this.type = type;
    this.creationDate = creationDate;
    this.customer = customer;
  }
  
  public int getId() {
    return id;
  }
  
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  
  public double getBalance() {
    return balance;
  }
  
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  
  public LocalDate getCreationDate() {
    return creationDate;
  }
  
  public Customer getCustomer() {
    return customer;
  }
}
