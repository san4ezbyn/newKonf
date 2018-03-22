
package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParseUtils extends Utils {

  /*  String type;
    String name;
    double weight;

    public ParseUtils ( ) {

    }

    public ParseUtils ( String type , String name , double weight ) {


        this.type = type;
        this.name = name;
        this.weight = weight;

    }

    public String getType ( ) {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public double getWeight ( ) {
        return weight;
    }

    public void setWeight ( double weight ) {
        this.weight = weight;
    }


    Lollipop lollipop = new Lollipop ();
    Choco    choco    = new Choco ();
    Fruit    fruit    = new Fruit ();*/


    public void ParseUtils ( ) throws IOException {

        List <String> contents = Files.readAllLines ( Paths.get ( "ListOfSweets.txt" ) , Charset.defaultCharset () );


        for (String line : contents) {
            List <String> elem = Arrays.asList ( line.split ( " " ) );


            switch (elem.get ( 0 )) {
                case "Lollipop": {
                   Lollipop lollipop = new Lollipop ();
                    lollipop.setName ( elem.get ( 1 ) );
                    lollipop.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( lollipop );
                    break;
                }
                case "Choco": {
                   Choco choco = new Choco ();
                    choco.setName ( elem.get ( 1 ) );
                    choco.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( choco );
                    break;
                }
                case "Fruit": {
                    Fruit fruit = new Fruit ();
                    fruit.setName ( elem.get ( 1 ) );
                    fruit.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( fruit );
                    break;
                }


            }

        }

    }

}







/* COPY
package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParseUtils extends Utils {

    Lollipop lollipop = new Lollipop ();
    Choco choco = new Choco ();
    Fruit fruit = new Fruit ();

    public void ParseUtils ( ) throws IOException {

        List <String> contents = Files.readAllLines ( Paths.get ( "ListOfSweets.txt" ) , Charset.defaultCharset () );
        for (String line : contents) {
            List <String> elem = Arrays.asList ( line.split ( " " ) );


            switch (elem.get ( 0 )) {
                case "Lollipop": {
                  //  Lollipop lollipop = new Lollipop ();
                    lollipop.setName ( elem.get ( 1 ) );
                    lollipop.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( lollipop );
                    break;
                }
                case "Choco": {
                    //Choco choco = new Choco ();
                    choco.setName ( elem.get ( 1 ) );
                    choco.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( choco );
                    break;
                }
                case "Fruit": {
                    //Fruit fruit = new Fruit ();
                    fruit.setName ( elem.get ( 1 ) );
                    fruit.setWeight ( Double.valueOf ( elem.get ( 2 ) ) );
                    podarok.add ( fruit );
                    break;
                }


            }

        }
        System.out.println ("Content of podarok: \n" + podarok);

    }
}


*/
