// See https://aka.ms/new-console-template for more information
using System;
using System.ComponentModel;

namespace _Nh12
{
    public class Program
    {
        public static void Main()
        {
            // Đặt Encoding cho Console
            Console.OutputEncoding = System.Text.Encoding.UTF8;
            SV s = new SV
            {
                MSSV = 102230197,
                Name = "Ngô Văn Lộc",
                Age = 20
            };
            //s.show();
            Console.WriteLine(s);

            SVCNTT s1 = new SVCNTT
            {
                MSSV = 102231095,
                Name = "Hà Đức Kiên",
                Age = 20,
                LT = true
            };
            //s1.show();
            Console.WriteLine(s1);

            SV s2 = new SV
            {
                MSSV = 102230215,
                Name = "Nguyễn Hiếu",
                Age = 20
            };

            QLSV DS = QLSV.Instance;
            DS.Add(s);
            DS.Add(s1);
            DS.Add(s2);

            Console.WriteLine("Danh sách sinh viên:");
            Console.WriteLine(DS);
            Console.WriteLine("Độ dài danh sách: " + DS.Length);

            //-----------------------------------------
            Console.WriteLine("Xóa tại vị trí 2");
            DS.RemoveAt(2);
            Console.WriteLine();
            Console.WriteLine(DS);

            //-----------------------------
            SV s3 = new SV
            {
                MSSV = 102230197,
                Name = "Ngô Văn Lộc",
                Age = 18
            };

            Console.WriteLine("Sau khi update Sv s3: ");

            DS.Update(s3);
            Console.WriteLine(DS);

            //--------------------------------
            SV s4 = new SV
            {
                MSSV = 102230198,
                Name = "Ngô Lộc",
                Age = 18
            };

            DS.Add(s4);
            Console.WriteLine(DS);
            Console.WriteLine("Hàm Search: ");


            SV[] arrSV = DS.Search("Lộc");

            foreach (SV _sv in arrSV) Console.Write(_sv);

            //------------------------------------------

            Console.WriteLine();
            Console.WriteLine("Hàm sort: ");
            SV[] arrSV1 = DS.Sort();
            foreach (SV _sv in arrSV1) Console.Write(_sv);

            
        }
    }
}