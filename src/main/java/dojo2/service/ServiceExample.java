package dojo2.service;

import dojo2.model.Example;

import java.util.logging.Logger;

public class ServiceExample {

    Logger logger = Logger.getLogger(ServiceExample.class.getName());

    public int something(){

        new Example("karal","evzen", 545l).getRating();

        int i = 1 + 1 ;

        logger.info("number" + i);

        return i;
    }

}
