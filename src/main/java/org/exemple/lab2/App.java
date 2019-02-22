package org.exemple.lab2;

import org.apache.commons.lang3.StringUtils;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		
		int a = 1452;
		int b = 567;
		int f = add(a,b);
		String hello = "";
		if (StringUtils.isEmpty(hello))
		{System.out.println("String");}
		
		/*if (StringUtils.isEmpty()) System.out.println("StringUtils est vide!");
		else System.out.println("StringUtils contient quelque chose");*/

    }

	public static int add(int a, int b) {
		return a+b;
	}
}
