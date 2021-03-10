package com.knoldus

import scala.collection.immutable._

object LastElement {

  // method for finding last element and its index
   def FindLastElement( list: List[Int]): Unit ={
     val lastIndex = list.length-1
     val lastElement = list(lastIndex)

     println("\nlast element is : "+ lastElement+ "\nand it's index is : "+lastIndex)
   }


  def main(args:Array[String]): Unit ={
    val myList: List[Int]= List(5,10,15,20,25)
     print("my list is : ")
          myList.foreach{x: Int => print(x+" ")}

     FindLastElement(myList)

  }

}
