package com.bharathy.show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class SnakeLaddder {
    int boardSize;
    Scanner scanner =new Scanner(System.in);
    
	HashMap <Integer,Integer> snakePositions=new HashMap();
	HashMap <Integer,Integer> ladderPositions=new HashMap();
	ArrayList<Player> playerList=new ArrayList();
	
  	void userQuery(String statement){
	System.out.println(statement);	
	}
	
  	int receivePosition() {
  		return scanner.nextInt();
  	}
  	
	public static void main(String[] args) {
	
		SnakeLaddder snakeLaddder=new SnakeLaddder();
		
		snakeLaddder.userQuery("Enter a board size");
		snakeLaddder.boardSize=snakeLaddder.receivePosition();
		
		
		snakeLaddder.userQuery("Enter a number of snakes");
		int numberOfSnakes=snakeLaddder.receivePosition();
		
		for(int i=0;i<numberOfSnakes;i++) {
			snakeLaddder.userQuery("Enter a head");
			int head=snakeLaddder.receivePosition();
			snakeLaddder.userQuery("Enter a tail");
			int tail=snakeLaddder.receivePosition();
			snakeLaddder.snakePositions.put(head, tail);
		}
		
		
		snakeLaddder.userQuery("Enter a number of ladder");
		int numberOfLadder=snakeLaddder.receivePosition();
		
		for(int i=0;i<numberOfLadder;i++) {
			snakeLaddder.userQuery("Enter a top");
			int top=snakeLaddder.receivePosition();
			snakeLaddder.userQuery("Enter a bottom");
			int bottom=snakeLaddder.receivePosition();
			snakeLaddder.ladderPositions.put(bottom, top);
		}
		
		snakeLaddder.userQuery("Enter a number of player and name one by one..");
		int numberOfPlayers=snakeLaddder.receivePosition();
		
		for(int i=0;i<numberOfPlayers;i++) {
			String name=snakeLaddder.scanner.next();
			snakeLaddder.playerList.add(new Player(name));
		}
		
		 boolean win=false;
	       
	        while(!win) {	
	        	Random random=new Random();
	        	
	        for(int j=0;j<numberOfPlayers;j++) {
	        	
	            Player currentPlayer=snakeLaddder.playerList.get(j);  
	            System.out.println(currentPlayer+"  Currently playing.....");
	        	int diceValue=random.nextInt(6)+1;
	        	System.out.println("Dice value   "+diceValue);
	        	
	        	
	        	if(!(currentPlayer.position+diceValue>100)) {
	        		currentPlayer.position=currentPlayer.position+diceValue;
		        	
		        	if(snakeLaddder.snakePositions.containsKey(currentPlayer.position)) {
		        		currentPlayer.position=snakeLaddder.snakePositions.get(currentPlayer.position);
		        	}
		        	
	                if(snakeLaddder.ladderPositions.containsKey(currentPlayer.position)) {
	                	currentPlayer.position=snakeLaddder.ladderPositions.get(currentPlayer.position);
		        	}
		        	
	        	}
	        	
	        	if(currentPlayer.position==snakeLaddder.boardSize) {
	        		
	        		snakeLaddder.userQuery(currentPlayer.name+" is winning");	
	        		win=true;
	        		break;
	        	}
	        	
                snakeLaddder.playerList.set(j, currentPlayer);
                snakeLaddder.userQuery(currentPlayer.name+" is currently playing current position "+currentPlayer.position);
                System.out.println();
                
                
	      }
	        
	        
	        
	        	}
		
	}
	
}
