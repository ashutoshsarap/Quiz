
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Questions obj = new Questions();
        obj.ready();
    }
}
    class Questions{
    Scanner sc = new Scanner(System.in);
    public void ready(){
        System.out.println("Welcome to the QUIZ!!");
        System.out.println("Ready to take on some Science questions?");
        System.out.println("Press 1 to enter the QUIZ");
        int ready= sc.nextInt();

        if(ready==1) {
            System.out.println("GREAT LETS GO!!");
            Quiz obj = new Quiz();
            obj.ques();
        }
            else {
                System.out.println("INVALID INPUT === TRY AGAIN");
                System.out.println("  ");
                ready();
            }
        }


    }


class Quiz {
    Scanner sc = new Scanner(System.in);
    int score;

    public void ques() {
        System.out.println("NOTE : PRESS THE CORRECT OPTION NUMBER FOR RESPECTIVE ANSWER");
        System.out.println("Q1. What is the chemical symbol for gold?");
        System.out.println("OPTIONS : 1.Au " +
                "2.Ge " +
                "3.Ag " +
                "4.NONE");
        int a1 = sc.nextInt();
        if (a1 <= 4 && a1 >= 1) {
            if (a1 == 1)
                score += 10;
        }
        else
            invalid();


        System.out.println("Q2. Which planet is known as the Red Planet?");
        System.out.println("OPTIONS : 1.Earth " +
                "2.Mars " +
                "3.Venus " +
                "4.NONE");
        int a2 = sc.nextInt();
        if( a2<=4 && a2>=1) {
            if (a2 == 2)
                score += 10;
        }
        else
            invalid();

        System.out.println("Q3. Which of the following is the hardest substance found in nature?");
        System.out.println("OPTIONS : 1.Iron " +
                "2.Diamond " +
                "3.Wood " +
                "4.Graphite");
        int a3 = sc.nextInt();
        if( a3<=4 && a3>=1) {
            if (a3 == 2)
                score += 10;
        }
        else
            invalid();

        System.out.println("Q4. What is the chemical symbol for water?");
        System.out.println("OPTIONS : 1.CO2 " +
                "2.H2SO4 " +

                "3.CH4 " +

                "4.H2O ");
        int a4 = sc.nextInt();
        if( a4<=4 && a4>=1) {
            if (a4 == 4)
                score += 10;
        }
            else
                invalid();

        System.out.println("Q5. What is the boiling point of water in Fahrenheit?");
        System.out.println("OPTIONS : 1.121F " +
                "2.143F " +
                "3.0F " +
                "4.212F ");
        int a5 = sc.nextInt();
        if( a5<=4 && a5>=1) {
            if (a5 == 4)
                score += 10;
        }
            else
                invalid();

        System.out.println("YOUR SCORE IS : " + score);

    }

    public void invalid() {
        System.out.println("INVALID INPUT === TRY AGAIN");
        System.out.println("   ");
        Questions obj = new Questions();
        obj.ready();
    }
}
