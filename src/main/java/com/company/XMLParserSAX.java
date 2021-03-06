package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.company.MyHandler;
import com.company.Utils;
import com.company.entity.Sweets;
import org.xml.sax.SAXException;

public class XMLParserSAX extends Utils {

    public static void runPARSER ( )throws FileNotFoundException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHandler handler   = new MyHandler();
            saxParser.parse(new File( "konfetki.xml" ), handler);

            //Get sweets list
            List<Sweets> podarok = handler.getEmpList();

            //print sweets information
            System.out.println( podarok);
        } catch (ParserConfigurationException | SAXException | IOException e) {
           e.printStackTrace();
        }
    }


}
