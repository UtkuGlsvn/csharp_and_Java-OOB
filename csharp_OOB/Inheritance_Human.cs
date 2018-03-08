using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace objectorientedprogramming
{
   public abstract class Inheritance_Human
    {
        //Inheritiance class create
        //base class


        //abstract method
        public abstract void new_human();

        //virtual method
        public virtual void girl()
        {
            Console.WriteLine("girl");
        }
        public virtual void boy()
        {
            Console.WriteLine("boy");
        }
    }
}
