package TDDPart1Classes;

public interface Expression {
	Expression plus(Expression addend);
	Money reduce(Bank bank, String to);
}
