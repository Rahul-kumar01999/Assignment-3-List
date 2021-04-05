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
package com.knoldus.LastElement

import scala.collection.immutable._

class LastElement {

  // method for finding last element and its index
   def findLastElement( list: List[Int]): (Int, Int) ={
     val lastIndex = list.length-1
     try {
       (list(lastIndex), lastIndex)
     }
     catch
       {
         case e: IndexOutOfBoundsException => (-1, -1)
       }
   }
  }
