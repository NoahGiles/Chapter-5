package practice;
/**
 * @author brosius
 * this is the example that I will give in class 
 */
import java.util.Scanner;
public class SwitchTasksForWeek {

    public static void main(String[] args)
    {
      String day;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a day during the week for your schedule? >>>>  ");
        day = input.nextLine();
        switch(day)
        {
            case "Monday":
            case "Tuesday":
                System.out.print("Prepare Powerpoint slides.");
                break;
            case "Wednesday":
                System.out.print("Remember D&D Thursday night call to confirm.");
                break;
            case "Thursday":
            case "Friday":  
                System.out.print("Meeting at 10 am.");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It is the weekend which means getting ready for Monday.");
                break;
            case "Humpday":
                System.out.println("This is not as funny as I think it is. ");
            default:
                System.out.print("That day does not exist to the know realm.");
        }
    }
    
}