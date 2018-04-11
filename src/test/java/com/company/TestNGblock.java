package com.company;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Arrays;
import static com.company.PodarokTest.sweetSet;
import static com.company.Utils.podarok;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.testng.Assert.assertEquals;

public class TestNGblock {



    @BeforeClass
    public static void beforeClass ( ) throws IOException {
        ParseUtils runParseUtil = new ParseUtils ();
        runParseUtil.parseMeth ();

        PodarokTest fillSweetSet = new PodarokTest();
        fillSweetSet.fillSweetSetMeth();


    }

@Test (enabled = true, groups = {"konfeta"}, priority=1)
public void methodNG1 (){
        Assert.assertTrue ( Utils.podarok.containsAll ( sweetSet ) );
    System.out.println ( "Method 1: ");
    }
    @Test( groups = {"sweet"},/*dependsOnMethods={"methodNG1"},*/ priority=1)
    public void dependOnMethod1 ( ) {
        System.out.println ( "Method 2 - dependOnMethod1:used for the sake of training " );
    }

    @Test( dependsOnGroups={"konfeta"}, priority=1)
    public void dependsOnGroup1 ( ) {

        System.out.println("Method 3 - dependsOnGroup1: used for the sake of training");
    }
    @Test(enabled = true, groups = {"sweet"}, priority=2, expectedExceptions =AssertionError.class, description = "AssertionError-text")
    public void errorMethod ( ) {
        System.out.println ( "Exception Method -4. Not Equals so i made Exception case" );
         org.testng.Assert.assertSame ( podarok.get(0), ( "NAME  Lol4 WEIGHT 12.0 gr" ) );

    }

    @DataProvider
    public Object[][] avaluateEq() {
        return new Object[][]{

                {podarok.get(0), sweetSet.get(0)},
                };
    }

   @Test (dataProvider = "avaluateEq", invocationCount = 5, invocationTimeOut = 100)
    public void assEq(Object ob1, Object ob2) {
        assertEquals(ob1, ob2);
        //System.out.println ( "podarok.get(0)  equal sweetSet.get(0)" );

    }


    @DataProvider
    public Object[][] avaluateEq2() {
        return new Object[][]{


               {sweetSet.get(0)}
        };
    }

    @Test (description = "Equal objects", dataProvider = "avaluateEq2")
    public void assEq2(Object x) {

        Assert.assertTrue(x.equals ( podarok.get(0)));
        System.out.println ( "DATA-Provider: assEq2 method: objects equal");

    }

    @DataProvider
    public Object[][] avaluateEq3() {
        return new Object[][]{

                 {"NAME  Peach WEIGHT 90.0 gr"}, {"NAME  Chocolade3 WEIGHT 13.0 gr"}, {"NAME  Lol4 WEIGHT 12.0 gr"},
                 };

        };

    @Test (expectedExceptions =AssertionError.class, description = "AssertionError happend", dataProvider = "avaluateEq3")
    public void assEq3(Object x) {



        Assert.assertTrue(x.equals ( podarok.get (0) ));
        System.out.println ( "DATA-Provider: assEq3 method: not equal, Exception practice");

    }

    @DataProvider
    public Object[][] avaluateEq5() {
        return new Object[][]{


                {sweetSet.get(0)}, {sweetSet.get(1)}, {sweetSet.get(2)}
        };
    }

    @Test (description = "Equal objects", dataProvider = "avaluateEq5")
    public void assEq5(Object x) {

        assertThat( Arrays.asList ( "NAME",   "Lol4",  "WEIGHT 12.0 gr"), hasItems ("NAME"));
        System.out.println ( "DATA-Provider: assEq2 method: objects equal");
        System.out.println ("sweetSet is  " + sweetSet);
    }



}
