package java_oop;

/**
 *
 * @author glsvn
 */
public class Main_class {

    public static void main(String[] args) {
        //Dogs class
        Dogs dog = new Dogs("Bucky");
        Dogs dog2 = new Dogs("Max", 3);
        dog.dog_age(2.5);
        dog.live();
        dog.reproductive();
        dog.setBreeds("Labrador");
        dog.getBreeds();
        //******************************************
        //Cats class
        System.out.println("*************************************************\n");
        Cats cat = new Cats("Tom");
        Cats cat2 = new Cats("Jerry",3);
        cat.cat_age(1.5);
        cat.eat("Milk");
        cat.setBreeds("Maine Coon");
       cat.getBreeds();
      
       
    }
    
}
