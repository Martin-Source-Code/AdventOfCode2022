package day6

import java.io.File

fun firstQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day6Data.txt")
    val data = file.readText()
    val list = mutableListOf<Char>()


    for(i in 0 until data.length)
    {
        val c = data[i]
        if(list.count() >= 4)
        {
            list.removeAt(0)
        }

        list.add(c)
        val set = mutableSetOf<Char>()
        set.addAll(list)

        if(set.count() == 4) {
            println(i + 1)
            break
        }
    }
}

fun secondQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day6Data.txt")
    val data = file.readText()
    val list = mutableListOf<Char>()


    for(i in 0 until data.length)
    {
        val c = data[i]
        if(list.count() >= 14)
        {
            list.removeAt(0)
        }

        list.add(c)
        val set = mutableSetOf<Char>()
        set.addAll(list)

        if(set.count() == 14) {
            println(i + 1)
            break
        }
    }
}