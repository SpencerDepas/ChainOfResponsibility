package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/7/16.
 */
public class Animal {



    private String diagnosis;
    private String animalType;



    public Animal(String animalType, String diagnosis) {
        this.diagnosis = diagnosis;
        this.animalType = animalType;

    }

    public String getDiagnosis() {
        return diagnosis;
    }


    public String getAnimalType() {
        return animalType;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}
