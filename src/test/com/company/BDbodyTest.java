package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class BDbodyTest extends BDbody {



    @Before
    public void before ( ) {
        BDbody bdBodyTest = new BDbody ();
        bdBodyTest.runBDbody ();
    }

    @Test
    public void assertNotNull ( ) {

        if (bd != null) {
            Assert.assertNotNull ( bd );
        }
        System.out.print ( "BD Object is not NULL\n" );
    }


}










