/** This is */

public class Animals {

    private String name;
    private String activity;
    // private int noOfLegs;

    public Animals(String name) {
        this.name = name;
        // this.sound = sound;
        // this.noOfLegs = legs;
    }

    public String getAnimalName(){
        return this.name;
    }

    public String typeOfAnimal() {

        String act = "";

        switch (this.name) {

            case "Rats":
            case "Dogs":
            case "dolphins":
                System.out.print(this.name + " - This is the examle of mammals animals ");
                act = "Walk";

                break;
            case "Parrot":
            case "Sparrow":
            case "Eagle":
                System.out.print(this.name + " - This is the examle of Birds");
                act = "Fly";

                break;
            default:
                System.out.println("Incorrect name provided");
                act = "Nothing";
                break;

        }
      this.activity = act;

        return act;
    }

    public void whatTheyDo() {
        if (this.activity.equalsIgnoreCase("Walk")) {
            System.out.println(this.name + " - They can not fly ");
        } else if (this.activity.equalsIgnoreCase("Fly")) {
            System.out.println(this.name + " - They can fly");
        } else {
            System.out.println("Nothing");
        }

    }
}