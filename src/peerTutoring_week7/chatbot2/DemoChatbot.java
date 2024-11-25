package peerTutoring_week7.chatbot2;

import java.util.Scanner;

public class DemoChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question;
        Chatbot jef = new Chatbot("Jef");

        System.out.println(jef);
        jef.StartConversation();
        do {
            System.out.print("");
            question = scanner.nextLine();
            System.out.println(jef.respondTo(question));
        } while (!question.equalsIgnoreCase("stop"));
    }
}
