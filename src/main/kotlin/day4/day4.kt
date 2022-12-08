package day4

import java.io.File

fun firstQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day4Data.txt")
    val data = file.readLines()
    var counter = 0

    for(i in data)
    {
        val group = i.split(",")
        val first = group[0].split("-")
        val second = group[1].split("-")

        val set1 = mutableSetOf<Int>()
        val set2 = mutableSetOf<Int>()

        set1.addAll(IntRange(first[0].toInt(),first[1].toInt()))
        set2.addAll(IntRange(second[0].toInt(),second[1].toInt()))

        val intersects = set1.intersect(set2)

        if(set1.count() == intersects.count() || set2.count() == intersects.count())
        {
            counter++;
        }
    }

    println(counter)
}

fun secondQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day4Data.txt")
    val data = file.readLines()
    var counter = 0

    for(i in data) {
        val group = i.split(",")
        val first = group[0].split("-")
        val second = group[1].split("-")

        val set1 = mutableSetOf<Int>()
        val set2 = mutableSetOf<Int>()

        set1.addAll(IntRange(first[0].toInt(), first[1].toInt()))
        set2.addAll(IntRange(second[0].toInt(), second[1].toInt()))

        val intersects = set1.intersect(set2)

        if (intersects.count() > 0) {
            counter++;
        }
    }
    println(counter)
}