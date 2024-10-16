import java.util.Random;

public class QuoteGenerator {
    private String[] quotes;

    public QuoteGenerator() {
        // Initialize the array with some quotes
        quotes = new String[]{
            "The only way to do great work is to love what you do. – Steve Jobs",
            "Life is what happens when you're busy making other plans. – John Lennon",
            "Get busy living or get busy dying. – Stephen King",
            "You have within you right now, everything you need to deal with whatever the world can throw at you. – Brian Tracy",
            "Believe you can and you're halfway there. – Theodore Roosevelt"
        };
    }

    // Method to get a random quote
    public String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }

    public static void main(String[] args) {
        QuoteGenerator quoteGenerator = new QuoteGenerator();
        
// Generate and print a random quote
        String randomQuote = quoteGenerator.getRandomQuote();
        System.out.println("Random Quote: " + randomQuote);
    }
}
