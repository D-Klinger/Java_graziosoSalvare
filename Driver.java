package graziosoSalvare;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>(); // Creates a Dog ArrayList
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); // Creates a monkey ArrayList

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();

        char choice;
        // Loop for menu options, starting with calling the displayMenu() method that was provided
        do {
            displayMenu();
            choice = scnr.nextLine().charAt(0);

            switch (choice) {
                case '1':
                    intakeNewDog(scnr);
                    break;
                case '2':
                    intakeNewMonkey(scnr);
                    break;
                case '3':
                    reserveAnimal(scnr);
                    break;
                case '4':
                    printDogs();
                    break;
                case '5':
                    printMonkeys();
                    break;
                case '6':
                    printAnimals("available");
                    break;
                case 'q':
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 'q');
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Created Monkey list for testing purposes (FF IX)
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Zidane", "Capuchin", "male", "3", "12.5", "08-15-2021", "Lindblum", "in service", false, "Dali", 15.3, 25.6, 30.2);
        Monkey monkey2 = new Monkey("Amarant", "Guenon", "male", "2", "9.8", "07-25-2021", "Treno", "training", true, "Gargan Roo", 14.1, 22.3, 28.5);
        Monkey monkey3 = new Monkey("Steiner", "Macaque", "male", "4", "18.2", "09-10-2021", "Alexandria", "intake", false, "Dali", 20.5, 30.8, 36.7);
        Monkey monkey4 = new Monkey("Dagger", "Tamarin", "female", "1", "6.4", "10-05-2021", "Dali", "training", false, "Madain Sari", 11.2, 18.7, 24.9);
        Monkey monkey5 = new Monkey("Garnet", "Capuchin", "female", "2", "10.3", "08-20-2021", "Alexandria", "in service", false, "Cleyra", 14.8, 24.7, 29.5);
        Monkey monkey6 = new Monkey("Vivi", "Guenon", "male", "1", "8.7", "07-15-2021", "Black Mage Village", "training", true, "Dali", 13.2, 21.5, 26.8);
        Monkey monkey7 = new Monkey("Freya", "Macaque", "female", "3", "15.6", "09-30-2021", "Burmecia", "intake", false, "Lindblum", 18.9, 28.4, 33.1);

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
        monkeyList.add(monkey4);
        monkeyList.add(monkey5);
        monkeyList.add(monkey6);
        monkeyList.add(monkey7);
    }

    // New Dog intake method
    public static void intakeNewDog(Scanner scanner) {
        try {
            System.out.println("What is the dog's name?");
            String name = scanner.nextLine();

            // Check if the dog with the same name already exists
            for (Dog dog : dogList) {
                if (dog.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis dog is already in our system\n\n");
                    return; // Returns to the original menu
                }
            }

            // Gather attributes for the Dog that is not on list
            System.out.println("What is the dog's breed?");
            String breed = scanner.nextLine();

            System.out.println("What is the dog's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the dog's age?");
            String age = scanner.nextLine();

            System.out.println("What is the dog's weight?");
            String weight = scanner.nextLine();

            System.out.println("What is the dog's acquisition date?");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What is the dog's acquisition country?");
            String acquisitionCountry = scanner.nextLine();

            System.out.println("What is the dog's training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("Is the dog reserved? (true or false)");
            boolean reserved = Boolean.parseBoolean(scanner.nextLine());

            System.out.println("What is the dog's in-service country?");
            String inServiceCountry = scanner.nextLine();

            // Create a new Dog object and add it to the list
            Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
            dogList.add(newDog);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }

    // New Monkey intake method
    public static void intakeNewMonkey(Scanner scanner) {
        try {
            System.out.println("Enter the monkey's name:");
            String name = scanner.nextLine();
            for (Monkey monkey : monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) { // Validation if Monkey is already added to the list
                    System.out.println("\nThis monkey is already in our system\n");
                    return; // returns to menu
                }
            }

            // Gather attributes for the Monkey that is not on the list
            System.out.println("Enter the monkey's species:");
            String species = scanner.nextLine();
            System.out.println("Enter the monkey's gender:");
            String gender = scanner.nextLine();
            System.out.println("Enter the monkey's age:");
            String age = scanner.nextLine();
            System.out.println("Enter the monkey's weight:");
            String weight = scanner.nextLine();
            System.out.println("Enter the monkey's acquisition date:");
            String acquisitionDate = scanner.nextLine();
            System.out.println("Enter the monkey's acquisition country:");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("Enter the monkey's training status:");
            String trainingStatus = scanner.nextLine();
            System.out.println("Enter the monkey's reserved status (true or false):");
            boolean reserved = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Enter the monkey's in-service country:");
            String inServiceCountry = scanner.nextLine();
            System.out.println("Enter the monkey's tail length:");
            double tailLength = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the monkey's height:");
            double height = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the monkey's body length:");
            double bodyLength = Double.parseDouble(scanner.nextLine());
             
            // Create a new Monkey object and add it to the list
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate,
                    acquisitionCountry, trainingStatus, reserved, inServiceCountry,
                    tailLength, height, bodyLength);

            monkeyList.add(newMonkey);
            System.out.println("Monkey added successfully!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }

    // Method to check for reserved animals
    public static void reserveAnimal(Scanner scanner) {
        try {
            System.out.println("Enter the animal type (Dog or Monkey):"); // Check Dog or Monkey
            String animalType = scanner.nextLine();

            System.out.println("Enter the in-service country:");
            String inServiceCountry = scanner.nextLine();

            boolean animalFound = false;

            // Search for a dog that matches the criteria
            for (Dog dog : dogList) {
                if (dog.getAnimalType().equalsIgnoreCase(animalType) && dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) {
                    dog.setReserved(true); // Set the dog to reserve
                    animalFound = true;
                    System.out.println("Dog reserved successfully.");
                    break; // Exit the loop once a match is found
                }
            }

            // If there are no Dogs, search the Monkey list
            if (!animalFound) {
                for (Monkey monkey : monkeyList) {
                    if (monkey.getAnimalType().equalsIgnoreCase(animalType) && monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) {
                        monkey.setReserved(true); // Reserve the monkey
                        animalFound = true;
                        System.out.println("Monkey reserved successfully.");
                        break; // Exit the loop once a match is found
                    }
                }
            }

            // If no matching animal is found, provide feedback
            if (!animalFound) {
                System.out.println("No matching animal found for the specified criteria.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }

    // Print animals list parameters
    public static void printAnimals(String listType) {
        switch (listType.toLowerCase()) {
            case "dog":
                printDogs();
                break;
            case "monkey":
                printMonkeys();
                break;
            case "available":
                printAvailableAnimals();
                break;
            default:
                System.out.println("Invalid list type.");
        }
    }

    // Print the Dog list
    public static void printDogs() {
        System.out.println("List of Dogs:");
        for (Dog dog : dogList) {
            if (!dog.getReserved()) {
                printAnimalInfo(dog);
            }
        }
    }

    // Print Monkey list
    public static void printMonkeys() {
        System.out.println("List of Monkeys:");
        for (Monkey monkey : monkeyList) {
            if (!monkey.getReserved()) {
                printAnimalInfo(monkey);
            }
        }
    }

    // Print list of all available animals that are not reserved or in service, starting with Dog list then Monkey list
    public static void printAvailableAnimals() {
        System.out.println("List of Available Animals:");
        for (Dog dog : dogList) {
            if (!dog.getReserved() && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                printAnimalInfo(dog);
            }
        }
        for (Monkey monkey : monkeyList) {
            if (!monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                printAnimalInfo(monkey);
            }
        }
    }

    // Method to print the Rescue Animals information for viewing
    private static void printAnimalInfo(RescueAnimal animal) {
        System.out.println("Name: " + animal.getName());
        System.out.println("Status: " + animal.getTrainingStatus());
        System.out.println("Acquisition Country: " + animal.getAcquisitionLocation());
        System.out.println("Reserved: " + (animal.getReserved() ? "Yes" : "No"));
        System.out.println();
    }
}
