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
            return "Sweets-BD:: Type=" + this.type + " Name=" + super.getName() +  " Weight=" + super.getWeight();
        }

    }






