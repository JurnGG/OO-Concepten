package peerTutoring_week7.chatbot1;

import java.util.Scanner;

public class DemoChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question;
        Chatbot jef = new Chatbot("Jef");

        System.out.println(jef);
        System.out.println("Tik 'stop' om te eindigen");
        do {
            System.out.print("");
            question = scanner.nextLine();
            System.out.println(jef.respondTo(question));
        } while (!question.equalsIgnoreCase("stop"));
    }
}
