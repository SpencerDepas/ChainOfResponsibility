package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/7/16.
 */
public class CancerDoctorProcessor implements Chain {
    //also called the receiver

    private Chain nextInChain;

    public void setNext(Chain c) {
        nextInChain = c;
    }

    public void process(Animal animal) {
        if (animal.getDiagnosis().equals("cancer")) {
            System.out.println("CancerDoctorProcessor will tend to : " + animal.getAnimalType());
            System.out.println("CancerDoctorProcessor has cured : " + "cancer");

            animal.setDiagnosis("no issues");
        } else {
            nextInChain.process(animal);
        }
    }
}