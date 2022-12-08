package day3

import java.io.File

fun firstQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day3Data.txt")
    val data = file.readLines()
    var counter = 0;
    for(word in data)
    {
        val compartment1 = mutableMapOf<Char,Int>()
        val compartment2 = mutableMapOf<Char,Int>()
        for(i in 0 until (word.length / 2))
        {
            compartment1.putIfAbsent(word[i],1);
        }
        for (i in word.length / 2 until word.length)
        {
            compartment2.putIfAbsent(word[i],1)
        }
        for(i in compartment2)
        {
            if (compartment1.containsKey(i.key))
            {
                counter += returnPriority(i.key)
            }
        }
    }
    println(counter)
}


fun secondQuestion() {
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day3Data.txt")
    val data = file.readLines()
    var counter = 0;

    for (i in 0 until data.count() step 3) {
        val bag1 = mutableSetOf<Char>()
        val bag2 = mutableSetOf<Char>()
        val bag3 = mutableSetOf<Char>()

        bag1.addAll(data[i].asIterable())
        bag2.addAll(data[i + 1].asIterable())
        bag3.addAll(data[i + 2].asIterable())

        val intersect = bag1.intersect(bag2.intersect(bag3))

        for (d in intersect) {
            counter += returnPriority(d)
        }
    }

    println(counter)
}

fun returnPriority(letter : Char) : Int
{
    if(letter.isLowerCase())
    {
        var l = 'a'
        for(i in 1..26)
        {
            if(letter == l)
                return  i;
            else
                l++
        }
    }
    else
    {
        var l = 'A'
        for(i in 27..52)
        {
            if(letter == l)
                return  i;
            else
                l++
        }
    }
    return  0;
}