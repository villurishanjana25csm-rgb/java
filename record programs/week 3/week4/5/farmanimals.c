class FarmAnimal {

    String name;
    String stay;
    String food;
    String sound;

    // Constructor
    FarmAnimal(String name, String stay, String food, String sound) {
        this.name = name;
        this.stay = stay;
        this.food = food;
        this.sound = sound;
    }

    // Display animal details
    void display() {
        System.out.println("Animal : " + name);
        System.out.println("Stays  : " + stay);
        System.out.println("Eats   : " + food);
        System.out.println("Sound  : " + sound);
        System.out.println();
    }
}

class FarmAnimals {
    public static void main(String[] args) {

        // Creating objects
        FarmAnimal cow = new FarmAnimal(
            "Cow", "Cowshed", "Grass", "Moo"
        );

        FarmAnimal pig = new FarmAnimal(
            "Pig", "Pigsty", "Vegetables", "Oink"
        );

        FarmAnimal horse = new FarmAnimal(
            "Horse", "Stable", "Grass and Hay", "Neigh"
        );

        // Display details
        cow.display();
        pig.display();
        horse.display();
    }
}