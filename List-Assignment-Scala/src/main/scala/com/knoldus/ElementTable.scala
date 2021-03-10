package com.knoldus

import scala.collection.immutable._

object ElementTable {

  // method for printing table of element
   def table(list: List[Int]): Unit = {
     for (element <- list) {
       println("table of " + element + " is : ")
       for (count <- 1 to 10) println(element + " * " + count + " = " + element * count)
       println()
     }
   }

  def main(args:Array[String]): Unit = {
    val myList: List[Int] = List(2, 3, 4, 5)
    print("my list is : ")
    myList.foreach { x: Int => print(x + " ") }
    println()
    table(myList)
  }

}
