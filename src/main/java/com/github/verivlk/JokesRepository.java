package com.github.verivlk;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class where jokes are stored.
 * source: https://www.readersdigest.ca/
 */

@Named
@Singleton
public class JokesRepository {
    private List<String> jokes = new ArrayList<>();

    public JokesRepository(List<String> jokes) {
        this.jokes = jokes;
    }

    /**
     * Adds first jokes into the list.
     */
    public JokesRepository() {
        jokes.add("What’s the best thing about Switzerland?\n" +
                "I don’t know, but the flag is a big plus.\n");
        jokes.add("How many times can you subtract 10 from 100?\n" +
                "Once. The next time you would be subtracting 10 from 90.\n");
        jokes.add("Sunday and Monday are in a fight. Who wins? Sunday. Monday is a weekday.\n");
        jokes.add("If Monday was a movie, it would be very long and boring. No one would ever want to watch it.\n");
        jokes.add("Hello Monday, can I ask you a question? Why are you always back so quickly? Do you not have a hobby?\n");
        jokes.add("Did you hear about the claustrophobic astronaut?\n" +
                "He just needed a little space.\n");
        jokes.add("Why don’t scientists trust atoms?\n" +
                "Because they make up everything.\n");
        jokes.add("What rhymes with orange\n" +
                "No it doesn’t.\n");
        jokes.add("What did the left eye say to the right eye?\n" +
                "Between you and me, something smells.\n");
        jokes.add("What did the 0 say to the 8?\n" +
                "Nice belt!\n");
        jokes.add("What do you call a magic dog?\n" +
                "A labracadabrador.\n");
        jokes.add("What did the shark say when he ate the clownfish?\n" +
                "This tastes a little funny.\n");
        jokes.add("What is an astronaut’s favourite part on a computer?\n" +
                "The space bar.\n");
        jokes.add("Why is Cinderella so bad at soccer?\n" +
                "Because she’s always running away from the ball—not to mention, she has a pumpkin for a coach!\n");
        jokes.add("Why shouldn’t you give Elsa a balloon?\n" +
                "Because she’ll let it go!\n");
        jokes.add("If every day is a gift, I want to know where I can return Mondays.\n");
        }

    public List<String> getJokes() {
        return jokes;
    }

    public void setJokes(List<String> jokes) {
        this.jokes.addAll(jokes);
    }

    /**
     * @return number of jokes
     */
    public int getJokesSize(){
        return jokes.size();
    }

    /**
     * @param id position of the joke in the list
     * @return joke on the id position
     */
    public String getJoke(int id){
        if (id >= jokes.size()) id = jokes.size() - 1;
        return jokes.get(id);
    }

    /**
     * @return random joke from the list
     */
    public String getRandomJoke(){
        Random rand = new Random();
        int rnd = rand.nextInt(getJokesSize());
        return getJoke(rnd);
    }
}
