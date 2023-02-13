public class ChildBankAccount { //класс, который будет контролировать работу карточного счёта:
    private double balance;
    private double maxBalance;
    public ChildBankAccount(double maxBalance) { //максимальный баланс на который можно пополнить счёт
        balance = 0.0;
        this.maxBalance = maxBalance;
    }
    public boolean depositMoney(double value) { //метод пополнения карточного счёта
        double sum = balance + value;
        if (sum > maxBalance || sum < balance) {
            return false;
        }
        balance = sum;
        return true;
    }
    public boolean debitMoney(double value) { //метод списания денег со счёта
        double sum = balance - value;
        if (sum < 0 || sum > balance) {
            return false;
        }
        balance = sum;
        return true;
    }
    public double getBalance() { //метод,будет возвращать текущий баланс
        return balance;
    }
}
