package week8.boerderijdieren.farm;

import week8.boerderijdieren.FarmAnimal;

public class Farm {
    private FarmAnimal[] animals;
    private int amountOfAnimals;

    public Farm(){
        animals = new FarmAnimal[5];
        amountOfAnimals = 0;
    }

    public boolean addAnimal(FarmAnimal animal){
        if(amountOfAnimals < animals.length){
            animals[amountOfAnimals] = animal;
            amountOfAnimals++;
            return true;
        }
        System.out.println("Er is geen plaats meer voor "+animal.getName()+".  De boerderij zit vol!");
        return false;
    }

    public void showAnimals(){
        for (int i = 0; i < amountOfAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public void showSounds(){
        for (int i = 0; i < amountOfAnimals; i++) {
            System.out.println(animals[i].getName() + " maakt geluid: " + animals[i].getSound());
        }
    }

    public void showFoods(){
        for (int i = 0; i < amountOfAnimals; i++) {
            System.out.println(animals[i].getName() + " eet: " + animals[i].getFood());
        }
    }

    public FarmAnimal findAnimalByName(String name){
        for (int i = 0; i < amountOfAnimals; i++) {
            if(animals[i].getName().equals(name)){
                return animals[i];
            }
        }
        return null;
    }
}
