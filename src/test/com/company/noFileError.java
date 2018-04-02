package com.company;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.io.IOException;

import java.io.FileNotFoundException;


public class noFileError /*extends XMLParserSAX*/ {

    public static int div ( int x , int y ) {

        if (y == 0) {
            throw new ArithmeticException ();
        }
        return x / y;
    }

    @Test(expected = ArithmeticException.class)
    public void DivByZero ( ) {


        Assert.assertEquals ( "Division by Zero" , 6 , noFileError.div ( 36 , 0 ) );
    }
}





