package banco;

public class Deposit extends Movement {
  public Deposit(double amount, int id) {
    super(id, ActionMovement.DEPOSIT, amount);
  }
}
