package com.pb.bolshakov.hw2;

public class calculator1 {
    private long theResult = 0;
    private long zero = 0;


    /**
     * perform the operation
     *  theResult = theResult 'action' number
     * @param action An arithmetic operation + - * /
     * @param number A whole number
     */
    public void evaluate( char action, long number)
    {

        if (action == '+'){
            theResult += number;
        }

        else if (action == '-'){
            theResult -= number;
        }

        else if (action == '*'){
            theResult *= number;
        }


        else if (action == '/'){
            theResult /= number;
        }


    }



    /**
     * Return the long calculated value
     * @return The calculated value
     */
    public long getValue()
    {
        return theResult;
    }

    /**
     * Set the stored result to be number
     * @param number to set result to.
     */
    public void setValue( long number )
    {
        this.theResult = number;
    }

    /**
     * Set the stored result to be 0
     */
    public void reset()
    {
        if ( theResult != 0) theResult = 0;


    }

}

