package jokemachine;

import java.util.ArrayList;
import java.util.Random;

public class JokeMachine
{
    private ArrayList<Joke> jokes;

    public JokeMachine()
    {
        loadJokesFromFile();
    }

    public void tellRandomJoke()
    {
        Random random = new Random();
        int randomJokeIndex = random.nextInt(jokes.size());
        Joke jokeToTell = jokes.get(randomJokeIndex);
        tellJoke(jokeToTell);
    }

    private void tellJoke(Joke jokeToTell)
    {
        System.out.println(jokeToTell.getOpener());
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie.getMessage());
        }
        System.out.println(jokeToTell.getPunchLine());
    }
}
