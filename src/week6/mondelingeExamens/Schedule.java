package week6.mondelingeExamens;

public class Schedule {
    private Time[] times;

    public void CreateSchedule(int numberOfStudents, int minutesPerExam, String start){
        Time currentTime = new Time(start);
        times = new Time[numberOfStudents+1];

        for(int i = 0; i < numberOfStudents; i++){
            times[i] = new Time(currentTime);

            currentTime.addMinutes(minutesPerExam);

            if(currentTime.getHours() == 10 && currentTime.getMinutes() == 30){
                currentTime.addMinutes(15);
            }
            if(currentTime.getHours() == 14 && currentTime.getMinutes() == 30){
                currentTime.addMinutes(15);
            }

            if(currentTime.getHours() == 12){
                currentTime.addMinutes(60);
            }


        }

        times[numberOfStudents] = new Time(currentTime);
    }

    public void printSchedule(){
        System.out.println("Schedule: ");
        for (int i = 0; i < times.length - 1; i++) {
            System.out.println(times[i]);
        }

        System.out.println("u bent gedaan om " + times[times.length - 1]);

    }
}
