/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop;

/**
 *
 * @author glsvn
 */

public  class Cats extends Carnivora{
    // Constructor
   private String breeds;
    public Cats(String name)
    {
        System.out.println("its name is "+name);
    }
    public Cats(String name, int age)
    {
        System.out.println("its name is "+name+"    it is  "+age);
    }
//****************************************************
//overloading method
public void cat_age(int age)
{
    System.out.println("it is"+age);
}
public void cat_age(double age)
{
    System.out.println("it is"+age);
}
//****************************************************
//Encapsulation

public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
         System.out.println(this.breeds);
    }


//****************************************************
//inheritance (Carnivora is base class)

    @Override
    public void eat(String a) {
        super.eat(a); //To change body of generated methods, choose Tools | Templates.
    }






     
}
