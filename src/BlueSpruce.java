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

public class BlueSpruce extends Tree{

    public BlueSpruce() {
        name = "Blue Spruce";
    }

    public int cost() {
        return 20;
    }
}
