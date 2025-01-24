using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _Nh12
{
    public class SVCNTT : SV 
    {
        public bool LT { get; set; }

        public override string ToString()
        {
            return "MSSV = " + MSSV + ", Name = " + Name + ", Age = " + Age + ", LT = " + LT.ToString() + "\n";
        }
    }
}
