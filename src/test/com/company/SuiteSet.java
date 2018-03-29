package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith ( Suite.class )
    @Suite.SuiteClasses ( {BDbodyTest.class, objectSame.class, parseEquals.class, noFileError.class, assertTrue.class} )

    public class SuiteSet {
    }