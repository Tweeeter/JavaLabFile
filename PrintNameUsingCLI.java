//Q1 Write a program in java which prints your name using command line arguments.
public class PrintNameUsingCLI {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Your name is " + args[0]);
        } else {
            System.out.println("No name provided!");
        }
    }
}
