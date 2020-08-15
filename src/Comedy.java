public class Comedy extends MoviesClass
{
    public Comedy()
    {
        super();
    }
    // call methods from base constructors, from previous class
    public Comedy(String movieRating, int IDNumber, String movieTitle2)
    {
        super(movieRating, IDNumber, movieTitle2);
    }
    public double calcLateFees(int daysLate)
    {
        System.out.println("The total for the late fees >>> " + 1.0 * daysLate);
        return 1.0 * daysLate;
    }
}
