package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class aa implements Serializable
{
 int a;
 int b;
 int c;
 int d;
	 public static void main(String args[])throws IOException, ClassNotFoundException
	 {  
		 System.out.println("umesh deshmukh");
		 System.out.println();
		 
		 
		 
		 
	  aa t1=new aa();
	  t1.a=100;
	  t1.b=200000000;
	  t1.c=300;
	  t1.d=400;
	  
	 File f=new File("C:\\Users\\PAVILION\\Desktop\\akshu.txt");
	 FileOutputStream fo=new FileOutputStream(f);
	 ObjectOutputStream os=new ObjectOutputStream(fo);
	 os.writeObject(t1);
	 System.out.println("data Seralized");
	 
	 FileInputStream fis=new FileInputStream("C:\\Users\\PAVILION\\Desktop\\akshu.txt");
	 ObjectInputStream ois=new ObjectInputStream(fis);
	 aa t2=(aa) ois.readObject();
	 System.out.println(t2.a);

	 System.out.println(t2.b);
	 System.out.println(t2.c);
	 System.out.println(t2.d);
	 
	 }  
	}  