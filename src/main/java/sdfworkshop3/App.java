package sdfworkshop3;


public class App 
{
    //print out first argument db name to create directory
    public static void main( String[] args ) 
    {
        if (args[0] != null){
            System.out.println(args[0]);
            // App.defaultDb = args[0];
        }

        System.out.println("default");
    }
}
