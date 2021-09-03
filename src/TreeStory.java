import java.io.Console;

public class TreeStory {
    /**
     * Some terms:
     * noun - Person, place or thing
     * verb - An action
     * adjective - A description used to modify or describe a noun
     * Enter your amazing code here!
     */
    public static void main(String[] args) {
        Console console = System.console();
        String ageAsString = console.readLine("How old are you?  ");

        int age = Integer.parseInt(ageAsString);
        if (age < 13) {
            // Insert exit code.
            console.printf("Sorry, you must be at least 13 to use this program \n");
            System.exit(0);
        }
        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        String noun = console.readLine("Enter a noun:  ");
        String adverb = console.readLine("Enter an adverb: ");
        String verb = console.readLine("Enter a verb ending with -ing:  ");

        console.printf("Your TreeStory:\n-------------\n");
        console.printf("%s is a %s %s ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);
    }
}
