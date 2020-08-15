public class Action extends MoviesClass
{
    public Action()
    {
        super();
    }
    // call methods from base constructors, from previous class
    public Action(String movieRating, int IDNumber, String movieTitle2)
    {
        super(movieRating, IDNumber, movieTitle2);
    }
    public double calcLateFees(int lateDays)
    {
        System.out.println("The total for the late fees >>> " + 3.0 * lateDays);
        return 3.0 * lateDays;
    }
}
