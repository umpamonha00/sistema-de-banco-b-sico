package banco;
import java.time.LocalDate;
import java.util.ArrayList;
public final class Account {
  private final int id;
  private String password;
  private double balance;
  private typeAccount type;
  private final Birth creationDate;
  private final Customer customer;
  private final ArrayList<Movement> bankStatement;
  
  public Account(int id, String password, typeAccount type, Birth creationDate, Customer customer) {
    this.id = id;
    this.password = password;
    this.type = type;
    this.creationDate = creationDate;
    this.customer = customer;
    this.bankStatement = new ArrayList<Movement>();
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
  
  public typeAccount getType() {
    return type;
  }
  public void setType(typeAccount type) {
    this.type = type;
  }
  
  public Birth getCreationDate() {
    return creationDate;
  }
  
  public Customer getCustomer() {
    return customer;
  }
}
