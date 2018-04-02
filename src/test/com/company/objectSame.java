package com.company;

import com.company.entity.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.failNotSame;

public class objectSame extends Utils {


    Lollipop lollipop = new Lollipop ();
    Choco    choco    = new Choco ();
    Fruit    fruit    = new Fruit ();

    @Test
    public void assertSame ( ) throws IOException {

        List <String> contents = Files.readAllLines ( Paths.get ( "ListOfSweets.txt" ) , Charset.defaultCharset () );
        List <Sweets> sweetset = new ArrayList <> ();


        for (String line : contents) {
            List <String> elem = Arrays.asList ( line.split ( " " ) );


            switch (elem.get ( 0 )) {
                case "Lollipop": {

                    lollipop.setName ( elem.get ( 1 ) );
                    lollipop.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    sweetset.add ( lollipop );
                    break;
                }
                case "Choco": {

                    choco.setName ( elem.get ( 1 ) );
                    choco.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    sweetset.add ( choco );
                    break;
                }
                case "Fruit": {

                    fruit.setName ( elem.get ( 1 ) );
                    fruit.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    sweetset.add ( fruit );
                    break;
                }

            }

        }
        ParseUtils runParseUtil = new ParseUtils ();
        runParseUtil.parseMeth ();

        Assert.assertNotSame ( ( "They are not the same:" ) , sweetset , podarok );


    }


}