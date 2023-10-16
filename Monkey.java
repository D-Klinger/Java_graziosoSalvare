package graziosoSalvare;

import java.util.Arrays;
import java.util.List;

public class Monkey extends RescueAnimal { // Monkey Class Subclass of RescueAnimal

    // Private instance variables for the Monkey Class per guidelines
    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;

    // Monkey Class Constructor
    public Monkey(String name, String species, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry,
                  double tailLength, double height, double bodyLength) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }

    // Monkey Class setter for species with input validation
    public void setSpecies(String monkeySpecies) {
        List<String> validSpecies = Arrays.asList(
                "capuchin", "guenon", "macaque", "marmoset", "squirrel monkey", "tamarin"
        );

        String lowercaseInput = monkeySpecies.toLowerCase(); // Convert Monkey Species to lowercase for easier comparability

        try {
            if (validSpecies.contains(lowercaseInput)) { // Compare lowercase input with lowercase valid species
                species = monkeySpecies; // Store the original user input
            } else {
                throw new IllegalArgumentException("Invalid monkey species.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Monkey Class setter for tail length
    public void setTailLength(double tailLength) {
        try {
            if (tailLength >= 0) {
                this.tailLength = tailLength;
            } else {
                throw new IllegalArgumentException("Tail length cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Monkey Class setter for body length
    public void setBodyLength(double bodyLength) {
        try {
            if (bodyLength >= 0) {
                this.bodyLength = bodyLength;
            } else {
                throw new IllegalArgumentException("Body length cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Monkey Class setter for height
    public void setHeight(double height) {
        try {
            if (height >= 0) {
                this.height = height;
            } else {
                throw new IllegalArgumentException("Height cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Monkey Class getter for tail length
    public double getTailLength() {
        return tailLength;
    }

    // Monkey Class getter for species
    public String getSpecies() {
        return species;
    }

    // Monkey Class getter for height
    public double getHeight() {
        return height;
    }

    // Monkey Class getter for body length
    public double getBodyLength() {
        return bodyLength;
    }
}
