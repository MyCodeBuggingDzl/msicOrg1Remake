
/**
 * Write a description of class while_loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class while_loop
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class while_loop
     */
    public while_loop()
    {
        // initialise instance variables
        
    }

    public int multipleOfFives(int number)
    {
        int x = number;
        while( x >= 10 && x <= 95){
             System.out.println(x);
             x = x+5;
        }
        
        return x;
    }
    
    public int sumLoop( int a, int b)
    //add a++ until reach b
    {
        int initial = 0;
        int value = a;
        while(value <= b){
            initial = initial + value;
            value++;
        }
        return initial;
    }
    
    public boolean isPrime(int n)
    {
        if(n <= 1){
            return false; //0 - 1 arent prime num
        }
        int divisor = 2;
        while( divisor < n){
            if(n% divisor == 0){
                return false; // not prime if 0
            }
            divisor++;
        }
        return true ;//if prime
    }
}