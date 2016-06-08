package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/7/16.
 */
public class PregnancyDoctorProcessor implements Chain {
    //also called the receiver


    private Chain nextInChain;

    public void setNext(Chain c) {
        nextInChain = c;
    }

    public void process(Animal animal) {
        if (animal.getDiagnosis().equals("pregnant")) {
            System.out.println("PregnancyDoctorProcessor will tend to : " + animal.getAnimalType());
            System.out.println("PregnancyDoctorProcessor has cured : " + "pregnancy");

            animal.setDiagnosis("no issues");
        } else {
            nextInChain.process(animal);
        }
    }
}