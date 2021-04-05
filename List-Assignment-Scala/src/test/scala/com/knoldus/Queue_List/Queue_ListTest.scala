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

//scalastyle:off magic.number
import org.scalatest.flatspec.AnyFlatSpec

class Queue_ListTest extends AnyFlatSpec{
  val queue= new Queue_List

  "Queue_List" should "return the peek element from the Queue " in{
    val result = queue.peek(List(12,23,34,45))
    val expected = 12
    assertResult(expected)(result)
  }

  it should "throw NoSuchElementException if there is no peek element in Queue" in{
    val result = queue.peek(List())
    val expected = -1
    assertResult(expected)(result)
  }

  it should "enQueue the elements to the Queue" in {
    val result = queue.enQueue(List(12,23,34,45),56)
    val expected = List(12,23,34,45,56)
    assertResult(expected)(result)
  }

  it should "deQueue the head element from the Queue " in{
    val result = queue.deQueue(List(12,23,34,45))
    val expected = List(23,34,45)
    assertResult(expected)(result)
  }

  it should "throw NoSuchElementException if we deQueue an Empty Queue" in{
    assertThrows[NoSuchElementException]{
      queue.deQueue(List())
    }
  }

  it should "display the elements present in the Queue " in{
    val result = queue.display(List(12,23,34,45))
    val expected = List(12,23,34,45)
    assertResult(expected)(result)
  }

  it should "work fine with negative elements " in{
    val result = queue.enQueue(List(12,-23,34,-45),-56)
    val expected = List(12,-23,34,-45,-56)
    assertResult(expected)(result)
  }
}
