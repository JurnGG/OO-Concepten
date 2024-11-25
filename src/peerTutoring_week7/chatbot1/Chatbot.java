package peerTutoring_week7.chatbot1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Chatbot {
    private String name;
    private Random random;
    private String[] responses;

    public Chatbot(String name) {
        this.name = name;
        random = new Random();
        responses = new String[]{
                "Hello! How can I help you today?",
                "I'm here to assist you with any questions.",
                "What can I do for you?",
                "Feel free to ask me anything.",
                "How can I be of service?",
                "Ok, probeer eerst al eens te herstarten",
                "Kan je het probleem eens herformuleren?",
                "En is dat al lang zo?",
                "Waarom heb je ons niet eerder gecontacteerd?",
                "Ik denk dat je dat zelf wel kan oplossen, niet?",
                "Die vraag heb ik nog niet vaak gehad!",
                "Sorry, ik was even bezig, kan je de vraag eens herhalen?",
                "Aha, gekend probleem, ik zoek het op en laat je iets weten.",
                "Sorry, daar heb ik niet direct een antwoord op. Wat nu?",
                "En dan?",
                "Dat zal wel, maar er zijn ergere dingen he.",
                "Hmm, die moet ik opzoeken. En wanneer deed dat zich juist voor?"
        };
    }

    public String respondTo(String q){
        if(q.length() < 4){
            return "";
        }
        if(q.equalsIgnoreCase("stop")){
            return "Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van " + name;
        }
        return responses[random.nextInt(responses.length)];
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm");
        String formattedDateTime = LocalDateTime.now().format(formatter);
        return formattedDateTime + "\nHallo, ik ben chatbot " + name + ", stel me een vraag en ik geef je een oplossing!";
    }
}
