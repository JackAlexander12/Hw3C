package com.company;

public class DataEntryException extends Exception
{
    // constructor that takes as input the integer data
    public DataEntryException(int data)
    {
        // call the super class constructor passing the message
        super("Invalid age or ID - DataEntryException - "+data);
    }
}
