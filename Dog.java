package graziosoSalvare;


public class Dog extends RescueAnimal { //Dog Class is subclass of RescueAnimal

	//Private instance variables for the Dog Class per guidelines
    private String breed;

    // Dog Class Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }
    
    // List of Dog Class setter
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

    // List of Dog Class getter
    public String getBreed() {
        return breed;
    }
}
//