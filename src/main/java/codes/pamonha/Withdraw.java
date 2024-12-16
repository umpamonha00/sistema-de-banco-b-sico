package banco;

public class Withdraw extends Movement {
  public Withdraw(double amount, int id) {
    super(id, ActionMovement.WITHDRAW, amount);
  }
}