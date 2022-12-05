using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace code2022
{
    public class Day1
    {
        public Day1()
        {
            string[] data = File.ReadAllLines("data.txt");
            List<int> elfs = new List<int>();

            int current = 0;
            for (int i = 0; i < data.Length; i++)
            {
                if (data[i] == "")
                {
                    elfs.Add(current);
                    current = 0;
                }
                else
                {
                    int num = int.Parse(data[i]);
                    current += num;
                }
            }

            elfs.Sort();
            int total = 0;
            for (int i = 0; i < 3; i++)
            {
                total += elfs[elfs.Count - 1 - i];
                Console.WriteLine(elfs[elfs.Count-1-i]);
            }
            Console.WriteLine(total);
            Console.ReadKey();
        }
    }
}
