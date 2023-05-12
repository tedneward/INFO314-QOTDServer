import java.util.*;

public class QuoteDB {
    private Random random = new Random();

    public final String[] quotes = {
        "'In the beginning there was Diet Coke. The end.' --Ted Neward",
        "'Do or do not. There is no try.' --Yoda",
        "'Do be do be do.' --Jazz",
        "'Like, thats just your opinion, man.' --The Dude"
    };

    public String randomQuote() {
        return quotes[random.nextInt(quotes.length)];
    }
}

