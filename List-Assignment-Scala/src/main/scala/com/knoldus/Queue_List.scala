package com.knoldus
class Queue_List {

  var list:List[Any] =List()
  var head: Int = -1
  var tail: Int = -1

   // method of Checking Queue is empty or not
  def isEmpty:Boolean = head== -1 || tail == -1

   // method for adding element to a Queue
  def enQueue(element:Int): Unit ={
    if(tail == -1 ){
      head= head + 1
      tail= tail + 1
      list= list ::: List(element)
    }
    else{
      tail= tail + 1
      list= list ::: List(element)
    }

  }

   // method for deleting element from Queue
  def deQueue(): Unit = {
    if(head== -1 && tail== -1) print("Queue is empty!!")
    else if(head == tail){
      list= list.drop(1)
      head= -1
      tail= -1
    }
    else{
      list= list.drop(1)
      head= head + 1
    }
   }

  }


object  Queue_ListImpl{
  def main(args: Array[String]): Unit ={
    val element = new Queue_List()
    print("initially no element in Queue")


    element.enQueue(1)
    element.enQueue(2)
    element.enQueue(3)
    element.enQueue(4)
    element.enQueue(5)


    println("\n\nafter adding some elements in Queue :")
     println(element.list)


    element.deQueue()
    element.deQueue()
    element.deQueue()


    println("\n\nafter deleting some elements from head then Queue become :")
     println(element.list)

    println("\n\nchecking Queue is empty or not!!")
    println(element.isEmpty)        // true if Queue is empty !! otherwise false
  }

}