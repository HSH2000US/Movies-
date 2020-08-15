import java.util.Scanner;

public class MoviesClass
{
    private String movieTitle;
    private int IdNum;
    private String rateMovie;
    // Constructor
    public MoviesClass()
    {
        IdNum = 0;
        movieTitle = "";
        rateMovie = "";
    }
    // Overriden
    public MoviesClass(String movieRating, int IDNumber, String movieTitle2)
    {
        IdNum = IDNumber;
        movieTitle = movieTitle2;
        rateMovie = movieRating;

    }
    // get and set methods
    public void setIDNum(int IDNumber)
    {
        IdNum = IDNumber;
    }
    public void setMovieRating(String MovieRating)
    {
        rateMovie = MovieRating;
    }
    public void setMovieTitle(String movieTitle2)
    {
        movieTitle = movieTitle2;
    }
    public String getMoveRating()
    {
        return rateMovie;
    }
    public int getIdNum()
    {
        return IdNum;
    }
    public String getMovieTitle()
    {
        return movieTitle;
    }
    public double calcLateFees(int daysLate)
    {
        System.out.println("The total for the late fees >>> " + 2.0 * daysLate);
        return 2.0 * daysLate;
    }
    // If not equal make Idnums/serial nums equal
    public boolean equals (MoviesClass movieObj)
    {
        if (movieObj == null)
        {
            return false;
        }
        else if (IdNum != movieObj.IdNum)
        {
            return false;
        }
        else
        {
            MoviesClass other = (MoviesClass)movieObj;
            return IdNum == other.IdNum;
        }
    }
    public String toString()
    {
        System.out.println("Movie Title >>>  " + movieTitle);
        System.out.println("Movie Rating >>> " + rateMovie);
        System.out.println("ID Number >>> " + IdNum);
        return "";
    }



}
