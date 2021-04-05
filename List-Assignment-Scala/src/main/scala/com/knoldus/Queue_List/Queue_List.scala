// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.knoldus.Queue_List

import scala.collection.immutable._

class Queue_List {

  // method of Checking peek element of the Queue_List
  def peek(list: List[Int]): Int={
    try{
      val peekElement =list.head

      peekElement
    }
    catch{
      case _: NoSuchElementException => -1
    }
  }
   // method for adding element to a Queue
  def enQueue(list: List[Int], element:Int): List[Int] ={
      val enqueue = list ::: List(element)
      enqueue
    }

   // method for deleting element from Queue
  def deQueue(list:List[Int]): Any ={
    list match{
      case Nil => throw new NoSuchElementException
      case _ => list.drop(1)
    }
   }

  // method for displaying Queue elements
  def display(list: List[Int]): List[Int]={
    list
  }

}