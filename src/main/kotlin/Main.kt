package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
data class Baseball (val num:String,val strike:Int,val ball : Int)

fun main(args: Array<String>) {
    val baseball = mutableListOf<Baseball>()
    repeat(readLine()!!.toInt()) {
        val(nu,strike,ball) = readLine()!!.split(' ').map { it.toInt() }
    }

    }


}