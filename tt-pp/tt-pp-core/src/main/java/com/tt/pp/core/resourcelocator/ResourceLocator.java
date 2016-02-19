package com.tt.pp.core.resourcelocator;

/**
 * Created by bellag on 1/29/16.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceLocator {

    private volatile static ResourceLocatorUnit resourceLocatorInstance = null;


    private static Lock initializationLock = new ReentrantLock();

    private static ResourceLocatorUnit createLocator() {

        try {
            initializationLock.lock();
            if (resourceLocatorInstance == null) {
                resourceLocatorInstance = new ResourceLocatorUnit();
            }
        } finally {
            initializationLock.unlock();
        }
        return resourceLocatorInstance;
    }

    public static ResourceLocatorUnit getDelegate() {
        if (resourceLocatorInstance == null) {
            createLocator();
        }
        return resourceLocatorInstance;
    }
}