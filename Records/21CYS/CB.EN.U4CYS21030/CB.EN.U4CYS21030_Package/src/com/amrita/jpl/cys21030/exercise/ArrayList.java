package com.amrita.jpl.cys21030.exercise;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The ArrayListExample class demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
 * It creates an ArrayList of student roll numbers, adds student roll numbers to it, and uses an Iterator to traverse and print the student roll numbers.
 * This class provides a basic example of working with ArrayList in Java.
 *
 * Usage:
 * - The program creates an ArrayList of strings to represent student roll numbers.
 * - It adds student roll numbers to the ArrayList.
 * - It retrieves an Iterator from the ArrayList to iterate over its elements.
 * - It uses the Iterator to print the student roll numbers one by one.
 *
 * Note: This example uses a simple ArrayList of strings and manually retrieves and prints the elements.
 *
 * Dependencies:
 * - None
 *
 * @author Kavali Sai Suvarchala
 * @version 0.5
 */
public class ArrayList {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> u21cys = new ArrayList<String>();
        ArrayList<String> u21cysfaculty = new ArrayList<String>();

        u21cys.add("CB.EN.U4CYS22026");
        u21cys.add("CB.EN.U4CYS22027");
        u21cys.add("CB.EN.U4CYS22028");
        u21cys.add("CB.EN.U4CYS22029");
        u21cys.add("CB.EN.U4CYS22030");

        u21cysfaculty.add("Ramaguru Radhakrishnan Sir");
        u21cysfaculty.add("Praveen Sir");
        u21cysfaculty.add("Aanand Sir");
        u21cysfaculty.add("Amrita Mam");
        u21cysfaculty.add("Amith sir");

        // Get the iterator
        Iterator<String> itCYS = u21cys.iterator();
        Iterator<String> itCYSFaculty = u21cysfaculty.iterator();

        // Print the student roll numbers using the iterator
        while (itCYS.hasNext()) {
            System.out.println(itCYS.next());
        }

        // Print the faculty names using the iterator
        while (itCYSFaculty.hasNext()) {
            System.out.println(itCYSFaculty.next());
        }
    }
}

