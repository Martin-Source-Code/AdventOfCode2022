using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdventOfCode2022
{
    public class Day1
    {
        public Day1()
        {
            string[] data = File.ReadAllLines("data.txt");
            List<int> elfs = new List<int>();

            int current = 0;
            for(int i = 0; i < data.Length; i++)
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

            int high = 0;
            for(int i = 0; i < elfs.Count; i++)
            {
                if(elfs[i] > high)
                {
                    high = elfs[i];
                }
            }

            Console.WriteLine(high);
            Console.ReadKey();
        }
    }
}
