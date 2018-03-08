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
public class Dogs implements AnimalInterface{
    
    String breeds;
    
    //Constructor (yapılandırıcı metot)
    public Dogs(String name)
    {
        System.out.println("its name is "+name);
    }
     public Dogs(String name, int age)
    {
        System.out.println("its name is "+name+"    it is "+age);
    }
    //****************************************************
    //Overloading(Aşırı yükleme)
    public void dog_age(int age)
    {
        System.out.println("it is "+age);
    }
    public void dog_age(double age)
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
//interface (AnimalInterface is interface class)

    @Override
    public void live() {
        System.out.println("dogs live on land");
    }

    @Override
    public void reproductive() {
      System.out.println("dogs are mammals");

    }
}
