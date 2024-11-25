package week8.contacten;

public class ContactData {
    private final int MAX_PHONE_NUMBERS = 5;
    private String email;
    private PhoneNumber[] phoneNumbers;
    private int phoneNumbersCount;

    public ContactData(String email) {
        this.email = email;
        phoneNumbers = new PhoneNumber[MAX_PHONE_NUMBERS];
        phoneNumbersCount = 0;
    }

    public String getEmail() {
        return email;
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (phoneNumbersCount < MAX_PHONE_NUMBERS) {
            phoneNumbers[phoneNumbersCount] = phoneNumber;
            phoneNumbersCount++;
        }
    }

    public PhoneNumber getPhoneNumber(int index) {
        if (index < phoneNumbersCount) {
            return phoneNumbers[index];
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(email + ", ");
        String landline = "geen vast nummer";
        String mobile = "geen mobiel nummer";

        for (int i = 0; i < phoneNumbersCount; i++) {
            if(phoneNumbers[i].getKind() == Kind.FIXED) {
                landline = phoneNumbers[i].toString();
            }
            if(phoneNumbers[i].getKind() == Kind.MOBILE) {
                mobile = phoneNumbers[i].toString();
            }
        }
        return sb.append(landline).append(", ").append(mobile).toString();
    }
}
