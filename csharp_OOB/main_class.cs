using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace objectorientedprogramming
{
    class main_class
    {
        static void Main(string[] args)
        {
            human h1 = new human("utku");//       We created a new object from class human
            //constructor method
            human h2 = new human("fatma", 19); //      We created a new object from class human

            //Overloading method
            h1.born();
            h2.born("Ankara");

            //Encapsulation
            h1.SetGender("boy");
            h2.GetGender();

            //polymorphism
            h1.boy();
            h2.girl();
      
            //inheritance
            h1.new_human();
           

            Console.ReadKey();
        }
    }
}
