
package Com.java;

import java.util.Scanner;
import java.util.Stack;

public class ChatBot{
    Stack<ChatClass> bs=new Stack<>();
    public static void main(String args[]){
        ChatBot chatbot=new ChatBot();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        try{
        String name=sc.next();
        System.out.println("Hii "+name+" I am Bot for Yours");
        chatbot.bs.push(new ChatClass(0,0));
        chatbot.show(0,0);
        int i=-1;
        while(i!=0){
            System.out.println();
            i=sc.nextInt();
            if(i==10){
                chatbot.bs.pop();
                if(chatbot.bs.isEmpty()){
                    break;
                }
            } else{
                chatbot.bs.push(new ChatClass(chatbot.bs.peek().getm() + 1,i));
            }}
            catch(InputMismatchException e){
            System.out.print("Enter a correct input");
                }
            ChatClass top=chatbot.bs.peek();
            chatbot.show(top.getm(),top.getn());
        }
    }
    void show(int k,int i){
        String[] info=getns(k,i);
        for(String list: info){
            System.out.println(list);
        }
        if(k!=0) {
        	 System.out.println("10 for Back\n0 for Exit");
        }
    }

    String[] getns(int k,int i){
        String[] info;
        if(k==0){
            info=new String[]{"1 for continue","0 for Exit"};
        } else if(k==1){
            info=new String[]{"1.Mobile","2.Laptops","3.SmartWatches","4.Cameras"};
         
        } else if(k==2){
            switch(i){
                case 1:
                    info=ReadClass.readFromFile("info1.txt");
                    break;
                case 2:
                    info=ReadClass.readFromFile("info2.txt");                   
                    break;
                case 3:
                    info=ReadClass.readFromFile("info3.txt");
                    break;
                case 4:
                    info=ReadClass.readFromFile("info4.txt");
                    break;
                default:
                    info=new String[]{};
            }
        } else if(k==3){
            info=new String[]{"your order placed successfully\n10for Back\nfor Exit"};
        } else{
            info=new String[]{};
        }

        return info;
    }
}
