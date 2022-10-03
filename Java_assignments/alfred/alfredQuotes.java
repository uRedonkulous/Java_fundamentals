import java.util.Date;
public class alfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Hello %s, %s. lovely to see you", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The current time is, " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE

        if (conversation.indexOf("Alexis") > -1){
            return "To slow, may i help you with that?";
        }
        if (conversation.indexOf("Alfred") > -1){
            return "I am here, shall i be of assistance?";
        }
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}