public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int fullDepositAmount = 2000;
        int depositAmount = 100;

        int finalBalance, countBonus;
        if (fullDepositAmount > 1000) {
            countBonus = fullDepositAmount / depositAmount;
            finalBalance = balance + fullDepositAmount + countBonus;
        } else {
            countBonus = 0;
            finalBalance = balance + fullDepositAmount;
        }
        System.out.println("Количество бонусов:" + countBonus);
        System.out.println("Итоговая сумма баланса:" + finalBalance);

    }
}
