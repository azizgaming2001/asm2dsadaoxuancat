/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm2dsachinh;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class ASM2dsachinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Myqueue mq = new Myqueue(); 
        Mystack ms = new Mystack();
        while(true){
            Scanner sc = new Scanner(System.in);
            try{
                System.out.println("");
                System.out.println("============ Menu ============");
                System.out.println("Enter 1: Input messages"); 
                System.out.println("Enter 2: Send messages");
                System.out.println("Enter 3: View Messages");
                System.out.println("Enter 4: Exit");
                System.out.println("==============================");
                System.out.println("Please enter your choice:");
                int t = sc.nextInt();
                switch(t) {
                    case 1:
                        System.out.println("You selected input messages!");
                        System.out.println("Please enter your message:");
                        sc = new Scanner(System.in);
                        String message = sc.nextLine();
                        if (message.length() > 250) {
                            System.out.println(
                                    "Message must be <= 250 characters,send failed");
                        } else if (message.length() <= 250) {
                            mq.enQueue(new Node(message));
                        }
                        break;
                    case 2:
                        System.out.println("You sent all messages!");
                        if (mq.isEmpty()){
                            System.out.println("No messages to send!");
                        }
                        while (!mq.isEmpty()) {
                            Node m = mq.deQueue();
                            ms.push(m);
                            if(mq.isEmpty()){
                                System.out.println("All messages sent!");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Messages received:");
                        if (ms.isEmpty()){
                            System.out.println("No messages received!");
                        }
                        while(!ms.isEmpty()){
                            System.out.println(ms.pop().getData());
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;                    
                    default:
                        System.out.println("Invalid selection!");
                        break;                    
                }
            }
            catch(Exception e){
                System.out.println("Invalid selection!");
            }
        }
    }
    
}
