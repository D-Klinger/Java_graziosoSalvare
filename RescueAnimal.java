package graziosoSalvare;

import java.lang.String;

public class RescueAnimal {

	//Private instance variables for the RescueAnimal Class
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // RescueAnimal Class Constructor
    public RescueAnimal() {
    }

  //List of Rescue Animal Class setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}
	
	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}
	
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}
	
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	
	
	//List of Rescue Animal Class getters
	public String getName() {
		return name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getGender() {
		return gender;
	}

	public String getAge() {
		return age;
	}

	public String getWeight() {
		return weight;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}

	public boolean getReserved() {
		return reserved;
	}

	public String getInServiceLocation() {
		return inServiceCountry;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}
}//