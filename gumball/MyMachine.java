import java.util.ArrayList;

public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    public ArrayList<Integer> coins_passed;
    public int remaining_amount;
    public int amount_passed;

    public GumballMachine( int size , int amount_passed , ArrayList<Integer> coins_passed )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.amount_passed = amount_passed;
        this.coins_passed = coins_passed;
        this.remaining_amount = 0;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
