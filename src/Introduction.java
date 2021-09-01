import java.io.Console;

public class Introduction {
    public static void main(String[] args) {
        Console console = System.console();
        // String firstName = "Selma";

        // Let's make the firstName variable a bit more dynamic by reading from the keyboard.

        String firstName = console.readLine("What is your name? ");


        console.printf("Hello, my name is %s\n", firstName);
        //console.printf("Hello, my name is Ragnar\n");
        // The \n is an called an escape character. This one handles newlines after the string.
        console.printf("%s is learning how to write Java\n", firstName);
    }
}
