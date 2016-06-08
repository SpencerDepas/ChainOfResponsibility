package com.clearfaun.playing.around;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Animal bigFatPig = new Animal("pig", "cancer");
        AnimalDoctorHandler animalDoctorHandler = new AnimalDoctorHandler(bigFatPig);

        //output
        //CancerDoctorProcessor will tend to : pig
        //CancerDoctorProcessor has cured : cancer

        System.out.println();
        Animal wideMouthedCat = new Animal("cat", "pregnant");

        AnimalDoctorHandler animalDoctorHandlerTwo = new AnimalDoctorHandler(wideMouthedCat);
        //output
        //PregnancyDoctorProcessor will tend to : cat
        //PregnancyDoctorProcessor has cured : pregnancy

        System.out.println();
        Animal longNeckedYellowDinosaur = new Animal("dinosaur", "skin issue");

        AnimalDoctorHandler animalDoctorHandlerThree = new AnimalDoctorHandler(longNeckedYellowDinosaur);
        //output
        //SkinDoctorProcessor will tend to : dinosaur
        //SkinDoctorProcessor has cured : skin issue


        System.out.println();
        Animal scaryHairyDog = new Animal("dog", "eye ball leakage");

        AnimalDoctorHandler animalDoctorHandlerFour = new AnimalDoctorHandler(scaryHairyDog);
        //output
        //Sorry we do not have a doctor to heal eye ball leakage



    }
}
