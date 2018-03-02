//base code for a simple card game
//import acm.graphics.*;
//import acm.program.*;
import acm.util.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
import java.util.Random;

import javax.swing.JOptionPane;

public class cardGameArraysAndGithub //extends GraphicsProgram
{

	public static void main(String[] args) {
		
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		String input1 = "";
		String input2 = "";
		
		Random randomNum = new Random();
		int max, min, p1c1, p1c2, p1c3, p2c1, p2c2, p2c3;
		max = 12;
		min = 0;
		

		// this will generate a random number
		p1c1 = min + randomNum.nextInt(max);
		p1c2 = min + randomNum.nextInt(max);
		p1c3 = min + randomNum.nextInt(max);
		p2c1 = min + randomNum.nextInt(max);
		p2c2 = min + randomNum.nextInt(max);
		p2c3 = min + randomNum.nextInt(max);
		 
		
		
		input1 = JOptionPane.showInputDialog ("Enter Player One Name");
		input2 = JOptionPane.showInputDialog ("Enter Player Two Name");
		
		JOptionPane.showMessageDialog (null, "Players are: " + input1 + " and " + input2);
		JOptionPane.showMessageDialog (null, "Player " + input1 + "'s Turn");
		JOptionPane.showMessageDialog (null, "Player " + input1 +" draws "+ ranks[p1c1] + ", " + ranks[p1c2] + ", and " + ranks[p1c3]);
		
			int sump1 = value[p1c1] + value[p1c2] + value[p1c3]; 
		
				JOptionPane.showMessageDialog (null, "Player " + input1 + "'s total is " + sump1);
		
		JOptionPane.showMessageDialog (null, "Player " + input2 + "'s Turn");
		JOptionPane.showMessageDialog (null, "Player " + input2 +" draws "+ ranks[p2c1] + ", " + ranks[p2c2] + ", and " + ranks[p2c3]);
		
			int sump2 = value[p2c1] + value[p2c2] + value[p2c3]; 
		
				JOptionPane.showMessageDialog (null, "Player " + input2 + "'s total is " + sump2);
		
		if  (sump1 > sump2)
		{
			JOptionPane.showMessageDialog (null, "Player " + input1 + " wins!");
		}
		else
		{
			JOptionPane.showMessageDialog (null, "Player " + input2 + " wins!");
		}
		if (sump1 >= 21 || sump2 >= 21)	
		{
			JOptionPane.showMessageDialog (null, "Error Game End");
		}
				
		//output test
				System.out.println(ranks[p1c1]);
				System.out.println(ranks[p1c2]);
				System.out.println(ranks[p1c3]);
				System.out.println(sump1);
				System.out.println(ranks[p2c1]);
				System.out.println(ranks[p2c2]);
				System.out.println(ranks[p2c3]);
				System.out.println(sump2);
	}
}
