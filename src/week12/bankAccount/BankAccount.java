package week12.bankAccount;

public class BankAccount {
    private String iban;

    public BankAccount(String iban) throws BankAccountException {
        if(!BankAccountValidator.isValidBelgianIban(iban)){
            throw new BankAccountException("Invalid IBAN", 0);
        }
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(iban);
        for (int i = 4; i < sb.length(); i += 5) {
            sb.insert(i, " ");
        }
        return sb.toString();
    }
}
