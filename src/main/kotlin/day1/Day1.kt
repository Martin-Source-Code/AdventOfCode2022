package day1

import java.io.File

fun firstQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day1Data.txt")
    val data = file.readLines()
    val list = mutableListOf<Int>()

    var counter = 0
    for(i in data)
    {
        if(i == "")
        {
            list.add(counter)
            counter = 0
        }
        else
        {
            counter += i.toInt()
        }
    }

    list.sortDescending()
    println(list[0])
}

fun secondQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day1Data.txt")
    val data = file.readLines()
    val list = mutableListOf<Int>()

    var counter = 0
    for(i in data)
    {
        if(i == "")
        {
            list.add(counter)
            counter = 0
        }
        else
        {
            counter += i.toInt()
        }
    }

    list.sortDescending()
    var total = 0

    for(i in 0..2)
    {
        println(list[i])
        total += list[i]
    }
    println("Total = $total")
}