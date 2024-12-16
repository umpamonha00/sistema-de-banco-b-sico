package banco;
public final class Movement {
  private final ActionMovement action;
  private final double amount;
  private final Account from;
  private final Account to;
  
  public Movement(ActionMovement action, double value) {
    this.action = action;
    this.value = value;
    this.from = null;
    this.to = null;
  }
  
  public Movement(ActionMovement action, double amount, Account from, Account to) {
    this.action = action;
    this.amount = amount;
    this.from = from;
    this.to = to;
  }
  
  public String getAction() {
    return action;
  }
  
  public double getAmount() {
    return amount;
  }
  
  public Account getFrom() {
    return from;
  }
  
  public Account getTo() {
    return to;
  }
}
