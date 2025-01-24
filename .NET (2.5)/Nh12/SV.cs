using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _Nh12
{
    public class SV
    {
        public int MSSV { get; set; }
        public string Name { get; set; }
        public int Age { get; set; }

        public void show()
        {
            Console.WriteLine("MSSV = {0}, Name = {1}, Age = {2}", MSSV, Name, Age);
        }

        public override string ToString()
        {
            return "MSSV = " + MSSV + ", Name = " + Name + ", Age = " + Age + "\n";
        }
    }
}
