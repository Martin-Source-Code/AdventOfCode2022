package day5

import java.io.File
import java.util.ArrayDeque

fun firstQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day5Data.txt")
    val data = file.readLines()

    var stack  = mutableListOf<ArrayDeque<Char>>()
    for(i in 1..9)
    {
        stack.add(ArrayDeque())
    }

    for(t in "PFMQWGRT") {
        stack[0].push(t)
    }
    for(t in "HFR") {
        stack[1].push(t)
    }
    for(t in "PZRVGHSD") {
        stack[2].push(t)
    }
    for(t in "QHPBFWG") {
        stack[3].push(t)
    }
    for(t in "PSMJH") {
        stack[4].push(t)
    }
    for(t in "MZTHSRPL") {
        stack[5].push(t)
    }
    for(t in "PTHNML") {
        stack[6].push(t)
    }
    for(t in "FDQR") {
        stack[7].push(t)
    }
    for(t in "DSCNLPH") {
        stack[8].push(t)
    }

    for(line in data)
    {
        var split = line.split(" ")

        for(i in 0 until split[1].toInt())
        {
            stack[split[5].toInt()-1].push(stack[split[3].toInt()-1].pop())
        }
    }

    var word = ""
    for(s in stack)
    {
        word += s.peek()
    }

    println(word)
}

fun secondQuestion()
{
    val file = File("D:\\Uni Work\\GitHub\\AdventOfCodeInKotlin\\src\\main\\resources\\Day5Data.txt")
    val data = file.readLines()

    var stack  = mutableListOf<ArrayDeque<Char>>()
    for(i in 1..9)
    {
        stack.add(ArrayDeque())
    }

    for(t in "PFMQWGRT") {
        stack[0].push(t)
    }
    for(t in "HFR") {
        stack[1].push(t)
    }
    for(t in "PZRVGHSD") {
        stack[2].push(t)
    }
    for(t in "QHPBFWG") {
        stack[3].push(t)
    }
    for(t in "PSMJH") {
        stack[4].push(t)
    }
    for(t in "MZTHSRPL") {
        stack[5].push(t)
    }
    for(t in "PTHNML") {
        stack[6].push(t)
    }
    for(t in "FDQR") {
        stack[7].push(t)
    }
    for(t in "DSCNLPH") {
        stack[8].push(t)
    }

    for(line in data)
    {
        val split = line.split(" ")
        val tempStack = ArrayDeque<Char>()

        for(i in 0 until split[1].toInt())
        {
            tempStack.push(stack[split[3].toInt()-1].pop())
        }

        for(i in tempStack)
        {
            stack[split[5].toInt()-1].push(i)
        }
    }

    var word = ""
    for(s in stack)
    {
        word += s.peek()
    }

    println(word)
}