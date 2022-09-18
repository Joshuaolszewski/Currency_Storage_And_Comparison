//Lab 1
//Joshua Olszewski 
//This is a Currency Simulator 
public class Wallet
{
    private USD[] array = new USD[2];
    
    //default constructor 
    public Wallet()
    {
        array[0] = new USD(0, 0, "USD");
        array[1] = new C2D(0, 0, "C2D");
        
    }
    
    protected void finalize()
    {
        
    }
    
    /* adds a usd value to usd object in wallet
     
    Precondition: Needs to be a usd object 
    Postcondition: the usd obj in the array gets updated to reflect addition
    return: void
    PseudoCode: 1) array[0] add currency (usd obj) 
                
    */
    public void add(USD obj)
    {
        array[0].addCurrency(obj);
    }
    
    /* subtracts a usd obj value from usd object in wallet
     
    Precondition: Needs to be a usd object 
    Postcondition: the usd obj in the array gets updated to reflect subtraction
    return: void
    PseudoCode: 1) array[0] subtract currency (usd obj) 
                
    */
    public void subtract(USD obj)
    {
        array[0].subtractCurrency(obj);
    }
    
    /* adds a C2D value to usd object in wallet
     
    Precondition: Needs to be a c2d object 
    Postcondition: the c2d obj in the array gets updated to reflect addition
    return: void
    PseudoCode: 1) array[1] add currency (usd obj) 
                
    */
    public void add(C2D obj)
    {
        array[1].addCurrency(obj);
    }
    
    /* subtracts a c2d value from usd object in wallet
     
    Precondition: Needs to be a c2d object 
    Postcondition: the c2d obj in the array gets updated to reflect subtraction
    return: void
    PseudoCode: 1) array[1] subtract currency (usd obj) 
                
    */
    public void subtract(C2D obj)
    {
        array[1].subtractCurrency(obj);
    }
    
    /* compares a usd object value to the one in the array
     
    Precondition: Needs to be a usd object
    Postcondition: none
    return: boolean
    PseudoCode: 1) if given usd object larger than one in array
                    1) true
                2) else
                    1) false 
                
    */
    public boolean isGreater(USD obj) 
    {
        if(obj.isLargerThan(array[0]))
        {
            return true;
        }
        else 
        {
            return false; 
        }
    }
    
    /* compares a c2d object value to the one in the array
     
    Precondition: Needs to be a c2d object
    Postcondition: none
    return: boolean
    PseudoCode: 1) if given c2d object larger than one in array
                    1) true
                2) else
                    1) false 
                
    */
    public boolean isGreater(C2D obj) 
    {
        if(obj.isLargerThan(array[1]))
        {
            return true;
        }
        else 
        {
            return false; 
        }
    }
    
    /* compares a usd object value to the one in the array
     
    Precondition: Needs to be a usd object
    Postcondition: none
    return: boolean
    PseudoCode: 1) if given usd object less than one in array
                    1) true
                2) else
                    1) false 
                
    */
    public boolean isLess(USD obj) 
    {
        if(obj.isLessThan(array[0]))
        {
            return true;
        }
        else 
        {
            return false; 
        }
    }
    
    /* compares a c2d object value to the one in the array
     
    Precondition: Needs to be a c2d object
    Postcondition: none
    return: boolean
    PseudoCode: 1) if given c2d object less than one in array
                    1) true
                2) else
                    1) false 
                
    */
    public boolean isLess(C2D obj) 
    {
        if(obj.isLessThan(array[1]))
        {
            return true;
        }
        else 
        {
            return false; 
        }
    }
    
    /* compares a usd object value to the one in the array
     
    Precondition: Needs to be a usd object
    Postcondition: none
    return: boolean
    PseudoCode: 1) if given usd object = to one in array
                    1) true
                2) else
                    1) false 
                
    */
    public boolean isEqualTo(USD obj)
    {
        if(obj.isEqual(array[0]))
        {
            return true;
        }
        else 
        {
            return false; 
        }
    }
    
    /* compares a c2d object value to the one in the array
     
    Precondition: Needs to be a c2d object
    Postcondition: none
    return: boolean
    PseudoCode: 1) if given c2d object = to one in array
                    1) true
                2) else
                    1) false 
                
    */
    public boolean isEqualTo(C2D obj)
    {
        if(obj.isEqual(array[1]))
        {
            return true;
        }
        else 
        {
            return false; 
        }
    }
    
    /* compares the two currencies in array with conversion factor 
     
    Precondition: array needs one usd and one c2d object 
    Postcondition: none
    return: string
    PseudoCode: 1) if conversion of c2d in array 1 into usd = usd in array 0
                    1) same value 
                2) else if converted c2d value in wallet > usd value in wallet 
                    1) more c2d than usd
                3)else
                    1) more usd than c2d 
                
    */
    public String compare()
    {
        if(isEqualTo(((C2D)array[1]).convertToUSD()))
        {
            return "The two Currencies have the same value";
        }
        else if(isGreater(((C2D)array[1]).convertToUSD()))
        {           
            return "You have more C2D than USD";
        }
        else
        {
            return "You have more USD than C2D";
        }
    }
    
    /* prints whole frac and name of usd object in array 0
     
    Precondition: Needs to be a usd object in array 0
    Postcondition: none
    return: string
    PseudoCode: 1) usd obj in array 0 get info from usd class 
                   
    */
    public String printValueZero()
    {
        return array[0].getInfo();
    }
    
    /* prints whole frac and name of c2d object in array 1
     
    Precondition: Needs to be a c2d object in array 1
    Postcondition: none
    return: string
    PseudoCode: 1) c2d obj in array 1 get info from usd class 
                   
    */
    public String printValueOne()
    {
        return array[1].getInfo();
    }
  
}
    
  
