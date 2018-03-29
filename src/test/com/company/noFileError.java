package com.company;


import org.junit.Test;
import java.io.FileNotFoundException;


public class noFileError extends XMLParserSAX {

   /* @Rule
    public ExpectedException expectedException = ExpectedException.none ();*/

    @Test //(expected =FileNotFoundException.class )

    public void toDOTest ( ) /*throws FileNotFoundException*/ {
       /* expectedException.expect ( FileNotFoundException.class );
        expectedException.expectMessage ( "ФАЙЛ НЕ ЗНОЙДЗЕНЫ" );*/


        XMLParserSAX sax = new XMLParserSAX();
        try {
            sax.runPARSER();
        } catch (FileNotFoundException e) {
            System.out.print ("No file found");
        }


    }








}
