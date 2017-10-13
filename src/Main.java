/*
Author: Brandon Howell & Kyle Schwarz
Class: CSI-340-01
Assignment: Lab 4 - Airline Reservation System
Date Assigned: 10/5/17
Due Date: 10/12/17 - 11:59pm

Description:
Implement the requirements for a Tree Decorator using the Decorator Design Pattern

Certification of Authenticity:
        I certify that this is entirely my own work, except where I have given
        fully-documented references to the work of others. I understand the
        definition and consequences of plagiarism and acknowledge that the assessor
        of this assignment may, for the purpose of assessing this assignment:
        - Reproduce this assignment and provide a copy to another member of
        academic staff; and/or
        - Communicate a copy of this assignment to a plagiarism checking
        service (which may then retain a copy of this assignment on its
        database for the purpose of future plagiarism checking)
*/

public class Main {
    public static void main(String [] args){
        Tree tree = new BlueSpruce();
        System.out.println(tree.getDescription() + " $" + tree.cost());

        Tree tree2 = new DouglasFir();
        tree2 = new Star(tree2);
        tree2 = new Ribbons(tree2);
        tree2 = new Star(tree2);
        tree2 = new Lights(tree2);
        System.out.println(tree2.getDescription() + " $" + tree2.cost());

        Tree tree3 = new FraserFir();
        tree3 = new Star(tree3);
        tree3 = new Ruffles(tree3);
        tree3 = new BallsBlue(tree3);
        tree3 = new BallsRed(tree3);
        tree3 = new BallsSilver(tree3);
        tree3 = new Ribbons(tree3);
        tree3 = new Lights(tree3);
        tree3 = new LEDs(tree3);
        System.out.println(tree3.getDescription() + " $" + tree3.cost());
    }
}
