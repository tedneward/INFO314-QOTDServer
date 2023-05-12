import random

class QuoteDB:
    quotes = [
        "'In the beginning there was Diet Coke. The end.' --Ted Neward",
        "'Do or do not. There is no try.' --Yoda",
        "'Do be do be do.' --Jazz",
        "'Like, thats just your opinion, man.' --The Dude"
    ]

    def randomQuote():
        return QuoteDB.quotes[random.randint(0, len(QuoteDB.quotes))]
