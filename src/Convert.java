import java.util.Scanner;

public class Convert {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please input a conversion. Examples are 1 m to km");
      System.out.println("Input 'exit' to terminate the program ");

      while (true) {
        String input = scan.nextLine();

        if (input.equals("exit")) {
          break;
        }

        String[] array = input.split(" ");
        if (array.length != 4) {
          System.out.println("Incorrect input, please try again. For example 1 km to m or 1 lb to kg or 1 ft to m or 1 km to mi");
          continue;
        }

        double enter = Double.parseDouble(array[0]);
        String first = array[1];
        String last = array[3];

        double result = 0;

        switch (first + "-" + last) {
          
          case "km-m":
            result = (enter * 1000);
            break;      

          case "kg-lb":
            result = (enter * 2.2);
            break;

          case "m-ft":
            result = (enter * 3.28);
            break;

          case "km-mi":
            result = (enter / 1.61);
            break;
         
           default:
            System.out.println("Incorrect input, please try again. For example 1 ft to m");
            continue;
        }
        System.out.println(String.format("%.2f %s = %.2f %s", enter, first, result, last));
        
      }
  
      scan.close();
  }
}