package com.company;

import com.company.Utils;
import com.company.entity.Choco;
import com.company.entity.Fruit;
import com.company.entity.Lollipop;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ParseUtils extends Utils {

    Lollipop lollipop = new Lollipop ();
    Choco    choco    = new Choco ();
    Fruit    fruit    = new Fruit ();


    public void parseMeth ( ) throws IOException {

        List <String> contents = Files.readAllLines ( Paths.get ( "ListOfSweets.txt" ) , Charset.defaultCharset () );


        for (String line : contents) {
            List <String> elem = Arrays.asList ( line.split ( " " ) );


            switch (elem.get ( 0 )) {
                case "Lollipop": {

                    lollipop.setName ( elem.get ( 1 ) );
                    lollipop.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( lollipop );
                    break;
                }
                case "Choco": {

                    choco.setName ( elem.get ( 1 ) );
                    choco.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( choco );
                    break;
                }
                case "Fruit": {

                    fruit.setName ( elem.get ( 1 ) );
                    fruit.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( fruit );
                    break;
                }
                default: {
                    break;
                }

            }


        }

    }

}










