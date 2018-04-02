package com.company;

import com.company.entity.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.company.Utils.podarok;

public class parseEquals  {

    Lollipop lollipop = new Lollipop ();
    Choco    choco    = new Choco ();
    Fruit    fruit    = new Fruit ();

    List <Sweets> sweettest = podarok;//new ArrayList <> ();


    @Test
    public void parseEquals ( ) throws IOException {

        List <String> contents = Files.readAllLines ( Paths.get ( "ListOfSweets.txt" ) , Charset.defaultCharset () );



        for (String line : contents) {
            List <String> elem = Arrays.asList ( line.split ( " " ) );


            switch (elem.get ( 0 )) {
                case "Lollipop": {

                    lollipop.setName ( elem.get ( 1 ) );
                    lollipop.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    sweettest.add ( lollipop );
                    break;
                }
                case "Choco": {

                    choco.setName ( elem.get ( 1 ) );
                    choco.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    sweettest.add ( choco );
                    break;
                }
                case "Fruit": {

                    fruit.setName ( elem.get ( 1 ) );
                    fruit.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    sweettest.add ( fruit );
                    break;
                }


            }

        }

        ParseUtils runParseUtil = new ParseUtils ();
        runParseUtil.parseMeth ();

System.out.print (podarok+"\n\n");
        System.out.print (sweettest);
        Assert.assertEquals ( podarok , sweettest );


    }
}


