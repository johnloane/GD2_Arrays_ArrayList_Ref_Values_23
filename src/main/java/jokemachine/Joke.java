package jokemachine;

public class Joke
{
    private String opener;
    private String punchLine;

    public Joke(String opener, String punchLine)
    {
        this.opener = opener;
        this.punchLine = punchLine;
    }

    public String getOpener()
    {
        return opener;
    }

    public String getPunchLine()
    {
        return punchLine;
    }
}
