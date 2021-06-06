package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * In the Service class, define business logic.
 * defined Synchronized method from which, one thread run at a time
 */


@Service
public class NumberService {

    @Autowired
    private NumberImpl numberDao;

    /**
     Synchronized method block used for multiple thread. run only one thread at a time.
     */
    synchronized void increaseCount(){
        /**
         calling method from Dao class
         */
        numberDao.countNumber();
    }
}
