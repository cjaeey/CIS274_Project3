// Carlos John Escala
// 08/21/24
// Lab 3, Keyboard Input
// This program determines how much you're plant has grown

import java.util.Scanner;
public class RoseSeed
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("How tall is the plant today in inches?");
        int today = keyboard.nextInt();
        System.out.println("How tall was the plant yesterday in inches?");
        int yesterday = keyboard.nextInt();
        int difference = today - yesterday;
        System.out.println ("The plant has grown " + difference + " inches.");
    }
}

