public class MainAnimal {

  public static void main(String... args) {


    Animals mammals = new Animals("dolphins");

    Animals birds = new Animals("Parrot");

    Animals fishs = new Animals("Nimo");

    Animals[] allAnimals ={ mammals, birds, fishs };

   
    for (int index = 0; index < allAnimals.length; index++) {

      System.out.println(allAnimals);
      System.out.println("That type of animal is:- " + allAnimals[index].typeOfAnimal(null));
      allAnimals[index].whatTheyDo();
      // System.out.println("");
    }

  }

}
