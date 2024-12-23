/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itcp;

/** Villaluna, Christian M. 
 * Final Challenge No. 3: University Course Enrollment and Grades Tracker (1D and 2D arrays)
 * Nov. 20, 2024
 */
import java.util.Scanner;

public class CourseEnrollmentTracker {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 5; // Number of students
        final int NUM_SUBJECTS = 3; // Number of subjects
        String[] studentNames = new String[NUM_STUDENTS]; // Array for student names
        double[][] grades = new double[NUM_STUDENTS][NUM_SUBJECTS]; // 2D array for grades
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Input student names
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Enter name for Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine(); // Read student name
        }

        // Input grades for each student in each subject
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter grades for " + studentNames[i] + ":");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print("Grade for Subject " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble(); // Read grade
            }
            scanner.nextLine(); // Consume the newline character
        }

        // Calculate and display average grades for each student
        for (int i = 0; i < NUM_STUDENTS; i++) {
            double sum = 0.0;
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                sum += grades[i][j]; // Sum grades for the student
            }
            double average = sum / NUM_SUBJECTS; // Calculate average grade
            System.out.printf("Average grade for %s: %.2f%n", studentNames[i], average); // Display average
        }

        scanner.close(); // Close the scanner to free resources
    }
}