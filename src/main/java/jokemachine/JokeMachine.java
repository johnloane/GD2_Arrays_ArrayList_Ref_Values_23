package jokemachine;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;

public class JokeMachine
{
    private ArrayList<Joke> jokes;

    public JokeMachine()
    {
        jokes = new ArrayList<>();
        loadJokesFromFile();
    }

    private void loadJokesFromFile()
    {
        try(Scanner filereader = new Scanner(new FileReader("jokes.txt")))
        {
            while(filereader.hasNextLine())
            {
                String input = filereader.nextLine();
                String[] data = input.split(",");
                String opener = data[0];
                String punchLine = data[1];
                Joke joke = new Joke(opener, punchLine);
                jokes.add(joke);
            }
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println(fnfe.getMessage());
        }
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
