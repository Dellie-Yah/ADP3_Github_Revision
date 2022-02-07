
/**
 * This is a simple basic application which
 * validates if the user's age is allowed
 * to resources or should be restricted.
 * @author Mbuso Kotobe 218040385
 * Created 04 February 2022
 * */
public class AgeRestriction
{
    private int age;
    private final int  ALLOWED_AGE = 18;

    public AgeRestriction()
    {
        age = 0;
    }

    public AgeRestriction(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void CheckAge() throws AgeRestrictionException
    {
        if(age < ALLOWED_AGE) throw new AgeRestrictionException("Age restriction policy.");
    }
}
