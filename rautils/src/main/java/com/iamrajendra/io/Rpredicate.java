package com.iamrajendra.io;

/**
 * Created by gwl on 14/12/17.
 */

public interface Rpredicate<T> {

    public T select(String varaibleName, Class aClass);

    public T greaterThen(int i);

    public T smallerThen(int i);
    public  T rEqualTo(Object o);


    public  T  rContatins(Object rajendra);

    public  T inverse();
}
