package com.company;

import com.company.entity.Choco;
import com.company.entity.Fruit;
import com.company.entity.Lollipop;
import com.company.entity.Sweets;
import org.junit.*;
import org.junit.rules.ExpectedException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static com.company.Utils.podarok;


public class PodarokTest {


    @BeforeClass
    public static void beforeClass ( ) throws IOException {
        ParseUtils runParseUtil = new ParseUtils ();
        runParseUtil.parseMeth ();
    }

    List <Sweets> sweetSet = new ArrayList <> ();

    @Before
    public void fillSweetSet ( ) {

        Lollipop lollipop = new Lollipop ();
        Choco    choco    = new Choco ();
        Fruit    fruit    = new Fruit ();

        lollipop.setName ( "Lol4" );
        lollipop.setWeight ( 12 );
        sweetSet.add ( lollipop );

        choco.setName ( "Chocolade3" );
        choco.setWeight ( 13 );
        sweetSet.add ( choco );

        fruit.setName ( "Peach" );
        fruit.setWeight ( 90 );
        sweetSet.add ( fruit );
    }


    @Test
    public void trueTest ( ) {
        Assert.assertTrue ( podarok.containsAll ( sweetSet ) );
    }


    @Test(expected = AssertionError.class)
    public void notEqualErorTest ( ) {
        Assert.assertEquals ( "Objects NOT EQUAL" , podarok , sweetSet );
    }


    @Rule
    public ExpectedException expectedException = ExpectedException.none ();
    @Test
    public void errorTest ( ) throws AssertionError {
        expectedException.expect ( AssertionError.class );
       // expectedException.expectMessage ( "NE RAVNU" );
        Assert.assertEquals ( podarok , sweetSet );
    }

    @Test
    public void verifyEqual (){
       Assert.assertEquals (podarok.toString().indexOf("Lol4"), sweetSet.toString().indexOf("Lol4"));

    }
}
