package com.ram.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Employee employee = new Employee();
        
        employee.setName("Ram Lodhi");
        
        System.out.println(employee.getName());
    }
}
