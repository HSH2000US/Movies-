public class Drama extends MoviesClass
{
    public Drama ()
    {
        super();
    }
    // call methods from base constructors, from previous class
    public Drama(String movieRating, int IDNumber, String movieTitle2)
    {
        super(movieRating, IDNumber, movieTitle2);
    }
    public double calcLateFees(int lateDays)
    {
        System.out.println("The total for the late fees >>> " + 2.0 * lateDays);
        return 2.0 * lateDays;
    }
}
