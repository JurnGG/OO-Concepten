package week7.boogschietclub;

public class Main {
    public static void main(String[] args) {
        Member[] members = {
                new Member("Murtadha"),
                new Member("Bart"),
                new Member("Alikhan"),
                new Member("Emma"),
                new Member("Bo"),
                new Member("Dachi")
        };

        for (Member member : members) {
            System.out.println(member.getNumber() + " " + member.getName());
        }

        System.out.println("Het volgende lidnummer is: " + Member.getNextId());
    }
}
