package banco;
public abstract class Movement {
  private final int id;
  private final ActionMovement action;
  private final double amount;
  
  public Movement(int id, ActionMovement action, double amount) {
    this.id = id;
    this.action = action;
    this.amount = amount;
  }

  public final int getId() {
    return id;
  }
  
  public final ActionMovement getAction() {
    return action;
  }
  
  public final double getAmount() {
    return amount;
  }
}
