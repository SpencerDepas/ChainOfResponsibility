package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/7/16.
 */
public class SkinDoctorProcessor implements Chain {
    //also called the receiver

    private Chain nextInChain;

    public void setNext(Chain c) {
        nextInChain = c;
    }

    public void process(Animal animal) {
        if (animal.getDiagnosis().equals("skin issue")) {
            System.out.println("SkinDoctorProcessor will tend to : " + animal.getAnimalType());
            System.out.println("SkinDoctorProcessor has cured : " + "skin issue");

            animal.setDiagnosis("no issues");
        } else {
            nextInChain.process(animal);
        }
    }
}