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
package com.knoldus.Stack_List

import scala.collection.immutable._

class Stack_List {

   // method for pushing element in stack
   def push(list: List[Int], element: Int): List[Int] ={
    val  pushElement= list ::: List(element)
     pushElement
   }

   // method for checking stack is empty or not
   def isEmpty(list: List[Int]): Boolean = {
   list match{
     case Nil => true
     case _ => false
     }
   }

   // method for getting peek element
  def peek(list: List[Int]): Any ={
    list match{
      case Nil => throw new NoSuchElementException
      case _ => list.reverse.head
    }
  }

   // method for popping element from stack
  def pop(list: List[Int]):Any ={
    list match{
      case Nil => throw new NoSuchElementException
      case _ => list.reverse.head
    }
  }

   //method to display elements present in stack
   def display(list: List[Int]): List[Int]={
     list
   }
}
