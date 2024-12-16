package banco;

public class Transference extends Movement {
  private final Account to;
  private final Account from;

  public Transference(int id, double amount, Account to, Account from) {
    super(id, ActionMovement.TRANSFER, amount);
    this.to = to;
    this.from = from;
  }

  public Account getTo() {
    return to;
  }

  public Account getFrom() {
    return from;
  }
}
