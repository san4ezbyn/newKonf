package com.company;

import com.company.entity.BDinit;
import com.company.entity.Sweets;

import java.sql.*;
import java.util.List;

public class BDbody extends Utils {


    //List to hold sweets object


   public BDinit bd = null;


    //getter method for sweets list
    public List <Sweets> getEmpList2 ( ) {
        return podarok;
    }

    public /*final*/ String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public  /*final*/ String DB_URL      = "jdbc:mysql://localhost/konf?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public
        /*static*/
    void runBDbody ( ) {

        Connection conn = null;
        Statement  stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName ( "com.mysql.jdbc.Driver" );

            //STEP 3: Open a connection
            System.out.println ( "Connecting to database..." );
            conn = DriverManager.getConnection ( DB_URL , USER , PASS );

            //STEP 4: Execute a query
            System.out.println ( "Creating statement..." );
            stmt = conn.createStatement ();
            String sql;
            sql = "SELECT type, name, weight from sweets";

            ResultSet rs = stmt.executeQuery ( sql );

            while (rs.next ()) {
                //Retrieve by column name

               bd = new BDinit ();
                bd.setType ( rs.getString ("type"));
                bd.setName ( rs.getString ( "name" ) );
                bd.setWeight ( rs.getInt ( "weight" ) );

                podarok.add (bd);
            }
            List <Sweets> podarok = getEmpList2 ();


            System.out.println ( podarok );

        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    }

