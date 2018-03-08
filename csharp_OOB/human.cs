using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace objectorientedprogramming
{
    class human:Inheritance_Human
    {
        //Derived class
        private string gender;
 
        //constructor(yapıcı) method
        public human (String name)
        {
            Console.WriteLine("My name is " + name);
        }
        public human (String name,int age)
        {
            Console.WriteLine("My name is " + name +", I am old "+age);
        }

        // Overloading(Aşırı yükleme) method
        public void born()
        {
            Console.WriteLine("people is born");
        }
        public void born(string where)
        {
            Console.WriteLine("I am from " + where);
        }

        //Encapsulation 

        public string GetGender()
        {
            return this.gender;
        }

        public void SetGender(string gender)
        {
            this.gender = gender;
        }
        // inheritance
        public override void new_human()
        {
            Console.WriteLine("new human create");
        }
        //polymorphism
        public override void girl()
        {
            Console.WriteLine("New human a girl");
        }
        public override void boy()
        {
            Console.WriteLine("New human a boy");
        }
    }
}
