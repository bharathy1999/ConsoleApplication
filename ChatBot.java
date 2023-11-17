package com.Vue;
import java.util.Stack;
import java.io.*;
import java.io.FileReader;
import java.util.Scanner;
public class ChatBot {
     static void read(Stack sk,String a) {
    	   try {
    	        FileReader fl=new FileReader(a);
    	        BufferedReader br = new BufferedReader(fl);
    	        String l;
    	        while((l=br.readLine())!=null) {
    	    		sk.push(l);
    			}
    			}
    			catch(FileNotFoundException e) {
    				e.printStackTrace();
    			}
    			catch(IOException ae) {
    				ae.printStackTrace();
    			}
       }
	public static void main(String[] args) {
		Stack sk=new Stack();
		System.out.println("Hiii I am for your service queries \n press 1 for continue \n otherwise press any number.");
		Scanner sc=new Scanner(System.in);
		byte q=sc.nextByte();
		if(q!=1) {
			return ;
		}
		System.out.print("Enter your name :");
		String a=sc.next();
		System.out.println("Hii "+a+" \n If you want a information about your plan press any of the given number below.\n else press 0 for exit.");
		read(sk,"Infoo.txt");
		while(!sk.isEmpty()) {
			System.out.println(sk.pop());
		}
		System.out.print("Enter a number:");
		byte k=sc.nextByte();
		if(k==0) {
			return ;
		}
		read(sk,"Abcd.txt");
		byte count=0;
		while(!sk.isEmpty()){
			count++;
			if(count==k) {
				break;
			}
			sk.pop();
		}
		System.out.println(sk.pop());
		while(!sk.isEmpty()){
			sk.pop();
		}
		
		

}
}