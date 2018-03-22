
package com.company;

        import java.util.ArrayList;
        import java.util.List;

        import org.xml.sax.Attributes;
        import org.xml.sax.SAXException;
        import org.xml.sax.helpers.DefaultHandler;

        import static com.company.Utils.podarok;

public class MyHandler extends DefaultHandler {

    //List to hold sweets object
    //private List <Sweets> podarok;
    private XMLSweetsInfo        emp     = null;


    //getter method for sweets list
    public List <Sweets> getEmpList ( ) {
        return podarok;
    }

    boolean bWeight = false;
    boolean bName   = false;
    boolean bType   = false;


    @Override
    public void startElement ( String uri , String localName , String qName , Attributes attributes )
            throws SAXException {

        if (qName.equalsIgnoreCase ( "sweets" )) {
            //create a new sweet and put it in Map
            String id = attributes.getValue ( "id" );
            //initialize sweet object and set id attribute
            emp = new XMLSweetsInfo ();
            emp.setId ( Integer.parseInt ( id ) );
            //initialize list
            if (podarok == null)
                podarok = new ArrayList <> ();
        }
        else if (qName.equalsIgnoreCase ( "name" )) {
            //set boolean values for fields, will be used in setting sweet variables
            bName = true;
        }
        else if (qName.equalsIgnoreCase ( "weight" )) {
            bWeight = true;
        }
        else if (qName.equalsIgnoreCase ( "type" )) {
            bType = true;

        }
    }

    @Override
    public void endElement ( String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase ( "sweets" )) {
            //add sweet object to list
            podarok.add ( emp );
        }
    }
    @Override
    public void characters ( char ch[], int start, int length) throws SAXException {


        if (bWeight) {
            //weight element, set sweets weight
            emp.setWeight ( Integer.parseInt ( new String ( ch , start , length ) ) );
            bWeight = false;
        }
        else if (bName) {
            emp.setName ( new String ( ch , start , length ) );
            bName = false;
        }
        else if (bType) {
            emp.setType ( new String ( ch , start , length ) );
            bType = false;
        }
    }
}


/*
COPY

        package com.company;

        import java.util.ArrayList;
        import java.util.List;

        import org.xml.sax.Attributes;
        import org.xml.sax.SAXException;
        import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

    //List to hold sweets object
    private List <Sweets> podarok = null;
    private XMLSweetsInfo        emp     = null;


    //getter method for sweets list
    public List <Sweets> getEmpList ( ) {
        return podarok;
    }

    boolean bWeight = false;
    boolean bName   = false;
    boolean bType   = false;


    @Override
    public void startElement ( String uri , String localName , String qName , Attributes attributes )
            throws SAXException {

        if (qName.equalsIgnoreCase ( "sweets" )) {
            //create a new sweet and put it in Map
            String id = attributes.getValue ( "id" );
            //initialize sweet object and set id attribute
            emp = new XMLSweetsInfo ();
            emp.setId ( Integer.parseInt ( id ) );
            //initialize list
            if (podarok == null)
                podarok = new ArrayList <> ();
        }
        else if (qName.equalsIgnoreCase ( "name" )) {
            //set boolean values for fields, will be used in setting sweet variables
            bName = true;
        }
        else if (qName.equalsIgnoreCase ( "weight" )) {
            bWeight = true;
        }
        else if (qName.equalsIgnoreCase ( "type" )) {
            bType = true;

        }
    }

    @Override
    public void endElement ( String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase ( "sweets" )) {
            //add sweet object to list
            podarok.add ( emp );
        }
    }
    @Override
    public void characters ( char ch[], int start, int length) throws SAXException {


        if (bWeight) {
            //weight element, set sweets weight
            emp.setWeight ( Integer.parseInt ( new String ( ch , start , length ) ) );
            bWeight = false;
        }
        else if (bName) {
            emp.setName ( new String ( ch , start , length ) );
            bName = false;
        }
        else if (bType) {
            emp.setType ( new String ( ch , start , length ) );
            bType = false;
        }
    }
}

*/
