// Programmer: Adam Curtin
// Course: CS 145 Java
// Date: 5/16/2023
// Lab: Towers of Hanoi
// Purpose: Recursive program that solves the "Towers Of Hanoi" puzzle with a 4 disks
// Done using Eclipse IDE. 

package towersOfHanoi;

public class SolveHanoi {

		    public static void main(String[] args) {
		    	// variables
		        int numDisks = 4;
		        String beginTower = "Tower 1";
		        String temporaryTower = "Tower 2";
		        String endTower = "Tower 3";

		        towersOfHanoi(numDisks, beginTower, endTower, temporaryTower);
		    } // end main method

		    public static void towersOfHanoi(int numDisks, String beginTower, String endTower, String temporaryTower) {
		    	// base case. Ends recursion
		        if (numDisks == 1) {
		            System.out.println("Move disk 1 from " + beginTower + " to " + endTower);
		        } else {
		        	// recursive case. Move n-1 disks from the beginTower to the temporaryTower
		        	// using endTower as middle man
		            towersOfHanoi(numDisks - 1, beginTower, temporaryTower, endTower);
		            // Move the largest disk from the beginTower to the endTower
		            System.out.println("Move disk " + numDisks + " from " + beginTower + " to " + endTower);
		            // Move the n-1 disks from the temporaryTower to the endTower 
		            // using beginTower as middle man
		            towersOfHanoi(numDisks - 1, temporaryTower, endTower, beginTower);
		        } // end else
		    } // end towersOfHanoi
} // end SolveHanoi Class
