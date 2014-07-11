package javaworld;

import java.io.*;

class ClassInitializationDemo4 {
	static String[] filenames;
	static {
		System.out.println("Acquiring filenames");
		filenames = new File(".").list();
		System.out.println("Filenames acquired");
	}

	public static void main(String[] args) {
		System.out.println("Displaying filenames\n");
		for (int i = 0; i < filenames.length; i++)
			System.out.println(filenames[i]);
	}
}