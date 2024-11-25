package week7.voetbalclub;

public class Members {
    private Member[] members;
    private static int numberOfMembers;
    private final int size = 100;

    public Members() {
        members = new Member[size];
        numberOfMembers = 0;
    }

    public Member[] getMembers() {
        return members;
    }

    public static int getNumberOfMembers() {
        return numberOfMembers;
    }

    public int getSize() {
        return size;
    }

    public void addMember(Member member) {
        if (numberOfMembers < size) {
            members[numberOfMembers] = member;
            numberOfMembers++;
        }
    }

    public Member getMember(int id) {
        for (int i = 0; i < numberOfMembers; i++) {
            if (members[i].getId() == id) {
                return members[i];
            }
        }
        return null;
    }

    public int getAmountOfActiveMembers() {
        int amount = 0;
        for (int i = 0; i < numberOfMembers; i++) {
            if (members[i].getType() != MemberType.SUPPORTING) {
                amount++;
            }
        }
        return amount;
    }

    public String printActiveMembers(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfMembers; i++) {
            if (members[i].getType() != MemberType.SUPPORTING) {
                result.append(members[i].toString()).append("\n");
            }
        }
        return result.toString();
    }
}
