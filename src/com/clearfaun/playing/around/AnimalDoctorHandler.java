package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/7/16.
 */
public class AnimalDoctorHandler {


    public AnimalDoctorHandler(Animal animal){

        Chain c1 = new CancerDoctorProcessor();
        Chain c2 = new PregnancyDoctorProcessor();
        Chain c3 = new SkinDoctorProcessor();

        c1.setNext(c2);
        c2.setNext(c3);

        try{

            c1.process(animal);

        }catch (Exception e){
            System.out.print("Sorry we do not have a doctor to heal " + animal.getDiagnosis() );
        }





    }
}
