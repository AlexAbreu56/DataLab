
public class Cereal {
    private String cerealName;
    private Double calories;
    private Double rating;


    public Cereal(String cN, double c, double r)
    {
        cerealName = cN;
        calories = c;
        rating = r;
    }
    
    public String getName()
    {
        return cerealName;
    }
    
    public double getCalories()
    {
        return calories;
    }
    public double getRating()
    {
        return rating;
    }

    public void setName(String cN)
    {
        cerealName = cN;
    }
    
    public void setCalories(double c)
    {
        calories = c;
    }
    public void setRating(double r)
    {
        rating = r;
    }

}
