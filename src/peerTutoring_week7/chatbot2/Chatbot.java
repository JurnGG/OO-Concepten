package peerTutoring_week7.chatbot2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Chatbot {
    private String name;
    private Random random;
    private LocalTime startTime;
    private String[] randomResponses;
    private String[] responses;
    private String[] keywords;

    public Chatbot(String name) {
        this.name = name;
        random = new Random();
        keywords = new String[]{
                "aanloggen", "traag", "scherm", "hangt", "kleuren", "trager", "geluid",
                "vooruit", "niet", "gisteren", "weekend", "geen idee", "oplossing",
                "geen", "zeker"
        };
        responses = new String[]{
                "Probeer opnieuw aan te loggen, lost dat je probleem op?",
                "Herstarten van het systeem kan vele snelheidsproblemen oplossen. Heb je dat al geprobeerd?",
                "Misschien is er iets mis met de video adapter?",
                "Je kan best nog even wachten, mogelijk lost het probleem zichzelf op.",
                "Heb je onlangs nieuwe videosoftware geïnstalleerd?",
                "Is er nog voldoende ruimte vrij op het toestel?",
                "Het volume staat toch juist he?",
                "Mogelijk een probleem met één van de systeemdrivers.",
                "Pas op, soms wel hoor.",
                "En eergisteren?",
                "In de week werken die dingen meestal vlotter...",
                "Niet wanhopen, we vinden samen wel een oplossing.",
                "Ik zal het wel oplossen, geef jij mij gewoon wat meer info.",
                "Echt geen?",
                "Ik ken dat 'zeker', uiteindelijk blijkt het toch niet!"
        };
        randomResponses = new String[]{
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

        for(int i = 0; i < responses.length; i++){
            if(q.toLowerCase().contains(keywords[i])){
                return responses[i];
            }
        }
        if(q.equalsIgnoreCase("stop")){
            return "Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van " + name +"!\n"
                    +EndConversation();
        }

        return responses[random.nextInt(responses.length)];
    }

    public String StartConversation(){
        startTime = LocalTime.now();
        return "Tik 'stop' om te eindigen";

    }

    public String EndConversation(){
        return "De conversatie duurde " + startTime.until(LocalTime.now(), ChronoUnit.SECONDS) + " sec.";
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm");
        String formattedDateTime = LocalDateTime.now().format(formatter);
        return formattedDateTime + "\nHallo, ik ben chatbot " + name + ", stel me een vraag en ik geef je een oplossing!";
    }
}
