package week12.bankAccount;

import java.text.ParseException;

public class BankAccountException extends ParseException {
    public BankAccountException(String message, int errorOffset) {
        super(message, errorOffset);
    }
}
