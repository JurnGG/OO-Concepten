package week12.bankAccount;

public class BankAccountValidator {
    public static boolean isValidBelgianIban(String iban) {
        try{
            if(iban == null || !iban.matches("^BE\\d{14}$")){
                return false;
            }

            String landcode = iban.substring(0, 2);
            int controleGetal = Integer.parseInt(iban.substring(2, 4));
            int bankCode = Integer.parseInt(iban.substring(4, 7));
            int rekeningNummer = Integer.parseInt(iban.substring(7, 14));
            int nationaalControleGetal = Integer.parseInt(iban.substring(14, 16));

            if((bankCode * 10000000L+ rekeningNummer) % 97 != nationaalControleGetal) {
                return false;
            }

            if (controleGetal < 2 || controleGetal > 98) {
                return false;
            }

            return true;

        }catch (NumberFormatException e){
            return false;
        }
    }

}
