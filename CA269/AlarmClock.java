import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int alarmHr = input.nextInt();
        int alarmMins = input.nextInt();

        int falseAlarms = 0;

        while (true) {
            int Hr = input.nextInt();
            int Mins = input.nextInt();

            if (Hr < alarmHr || Hr == alarmHr && Mins < alarmMins) {
                falseAlarms++;
            }
            else {
                break;
            }

        }

        System.out.println("false alarms: " + falseAlarms);
    }
}