package com.amrita.jpl.cys21073.practice;


import java.util.LinkedList;

/**
 * The LinkedListExample class demonstrates the usage of LinkedList to store and retrieve elements.
 * It creates a LinkedList to store car names.
 * This class provides a basic example of working with LinkedList in Java.
 * <p>
 * Usage:
 * - The program creates a LinkedList called cars to store student roll numbers.
 * - It adds elements to the LinkedList using the add() method.
 * - It prints the contents of the LinkedList.
 * <p>
 * Note: This example uses a LinkedList of strings to represent student roll numbers.
 *
 * Dependencies:
 * - None
 *
 * @author sudeep
 * @version 0.5
 */
public class linkedlist {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of LinkedList to store and retrieve elements.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> u21cys = new LinkedList<>();

        u21cys.add("CB.EN.U4CYS22031");
        u21cys.add("CB.EN.U4CYS22032");
        u21cys.add("CB.EN.U4CYS22033");
        u21cys.add("CB.EN.U4CYS22034");
        u21cys.add("CB.EN.U4CYS22035");

        // Print the contents of the LinkedList
        System.out.println(u21cys);
    }
}