package org.se.lab;

import java.lang.System;

public class Hello
{
    public static void main(String... args)
    {
        System.out.println("Hello World!");
		System.out.println("Hello Egon!");
		System.out.println("Hello Welt!");
		printToConsole("Hello Kapfenberg!");
		printToConsole("Hello Console!");
    }
	public static void printToConsole(String message)
    {
		System.out.println(">>" + message);
	}
}