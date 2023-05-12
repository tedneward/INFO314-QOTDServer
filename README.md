# INFO314-QOTDServer

Hello! In this assignment, you will be writing a simple network server that provides "quote of the day" services, as described in [RFC 865](https://datatracker.ietf.org/doc/html/rfc865.html).

Your service must listen on both TCP and UDP ports (as described in the RFC), and you must test your implementation using both a TCP client (such as telnet) and a UDP client (which you may have to write; if you do write one, feel free to share it with your classmates--the UDP client itself is **not** part of the assignment and therefore not subject to the restrictions around academic honesty).

You may use Python or Java for this assignment; if you wish to use a different language, please check with myself and the TA first.

> **NOTE:** There is a "QuoteDB" class in each of the Java and Python directories to help you with how a "quote database" might be implemented; you are free to use this, or not, as you see fit.

## Stories/Rubric (5 pts)

* It responds to TCP (1pt)
* It responds to UDP (1pt)
* Quotes must be different on each request (up to a dozen or so requests) (1pt)
* It can handle multiple requests simultaneously (1pt)
* It has quotes from the Princess Bride (see [here](https://parade.com/983468/alexandra-hurtado/princess-bride-quotes/) if you don't know any--but if you don't know any, go watch the movie! That is now part of your homework!) (1pt)

## Extra credit

* It includes quotes from your favorite movies (1pt)
