package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);

        System.out.println("Original list: " + numbers);

        try {
            // Removes the duplicates
            Set<Integer> NumbersSet = new HashSet<>(numbers);
            List<Integer> NumbersList = new ArrayList<>(NumbersSet);

            // Average calculation
            int sum = 0;
            for (int num : NumbersList) {
                sum += num;
            }
            double average = (double) sum / NumbersList.size();

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("List without duplicates: " + NumbersList);

        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
