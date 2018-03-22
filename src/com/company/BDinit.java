package com.company;

public class BDinit extends Sweets {

        private String type;

        public BDinit ( ) {
        }
        public BDinit ( String name , double weight , String type ) {

            super ( name , weight );

            this.type = type;
        }

        public String getType ( ) {
            return type;
        }

        public void setType ( String type ) {
            this.type = type;
        }

        @Override
        public String toString ( ) {
            return "Sweets-file:: Type=" + this.type + " Name=" + super.getName() +  " Weight=" + super.getWeight();
        }

    }







/*
COPY
package com.company;

public class BDinit extends Sweets{


        private int    id;


        public BDinit ( ) {
        }

        public BDinit ( String name , double weight , int id ) {

            super ( name , weight );


            this.id = id;

        }

             public int getId ( ) {
            return id;
        }

        public void setId ( int id ) {
            this.id = id;
        }


        @Override
        public String toString ( ) {
            return "Sweets:: ID=" + this.id + " Name=" + super.getName() +  " Weight=" + super.getWeight();
        }


    }




*/
