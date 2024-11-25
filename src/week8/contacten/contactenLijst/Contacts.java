package week8.contacten.contactenLijst;

import week8.contacten.Contact;

public class Contacts {
    private Contact[] contacts;
    private int amount;
    private final int CAPACITY = 100;

    Contacts(){
        contacts = new Contact[CAPACITY];
        amount = 0;
    }

    public void addContact(Contact contact){
        if(amount < CAPACITY){
            contacts[amount] = contact;
            amount++;
        }
    }

    public int getAmount() {
        return amount;
    }

    public Contact getContact(int index){
        if(index < amount){
            return contacts[index];
        }
        return null;
    }

    public boolean removeContact(int index){
        if(index < amount){
            for(int i = index; i < amount - 1; i++){
                contacts[i] = contacts[i + 1];
            }
            amount--;
            return true;
        }
        return false;
    }
}
