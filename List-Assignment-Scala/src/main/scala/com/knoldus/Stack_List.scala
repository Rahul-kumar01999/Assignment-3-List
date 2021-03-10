package com.knoldus

class Stack_List {
   var list:List[Any]= List()
   var top:Int= -1

   // method for pushing element in stack
   def push(element:Any): Unit ={
     top= top+1
     list= list ::: List(element)
   }

   // method for checking stack is empty or not
   def isEmpty: Boolean = {
    if(top<0) true
    else false
   }

   // method for getting peek element
  def peek(): Any ={
    if(!isEmpty) list(top)
    else println(" no top element found!!")
  }

   // method for poping element from stack
  def pop():Unit ={
    if(top<0) print("Underflow_Stack")
    else {
      top= top-1
      list= list.dropRight(1)
    }
  }

   //method to display elements present in stack
  def display(): Any ={
    if(top>=(-1)){
      println("now stack elements are: ")
       var i:Int = top
       while(i>(-1)){
         print(list(i)+" ")
         i=i-1
       }
    }
    else println("no element in stack!! ")
  }


}

object Stack_ListImpl{

  def main(args:Array[String]): Unit ={
     val element = new Stack_List()
     print("initially no element in stack!!")

      element.push(1)       // pushing elements in stack
      element.push(2)
      element.push(3)
      element.push(4)
      element.push(5)

    println("\n\nafter pushing some elements in stack!!")
      element.display()            // displaying the elements present in stack

      println("\n\npeek element in stack is : "+ element.peek())  // getting peek/top element present in stack


      element.pop()       // poping elements from stack
      element.pop()
      element.pop()

    println("\n\nafter poping out some elements!!")
      element.display()

      println("\n\nis stack is empty? : "+ element.isEmpty)   //checking status of stack


  }

}