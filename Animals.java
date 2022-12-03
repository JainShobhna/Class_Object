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

    public String typeOfAnimal(String name1) {

        this.name = name1;
        String act =this.activity;

     this.activity = act;

        switch (name1) {

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
                break;

        }
        return this.activity = act;
    }

    public void whatTheyDo() {
        if (this.activity.equalsIgnoreCase("Walk")) {
            System.out.println(this.name + " - They can not fly ");
        } else {
            System.out.println(this.name + " - They can fly");
        }

    }
}