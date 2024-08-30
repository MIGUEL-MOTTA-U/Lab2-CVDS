package edu.eci.cvds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args == null || args.length==0){
            System.out.println("Hello world!");
        }else {
            System.out.printf("Hello %s %s!", args[0], args[1]);
        }
    }
}
