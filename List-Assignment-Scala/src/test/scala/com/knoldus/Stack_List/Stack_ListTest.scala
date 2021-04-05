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
//scalastyle:off magic.number
import org.scalatest.flatspec.AnyFlatSpec

class Stack_ListTest extends AnyFlatSpec{
  val stack = new Stack_List

  "Stack_List" should "return peek element from the Stack " in{
    val result = stack.peek(List(12,23,34,45))
    val expected = 45
    assertResult(expected)(result)
  }

  it should "throw NoSuchElementException if there is no peek element in Stack" in{
    assertThrows[NoSuchElementException]{
      stack.peek(List())
    }
  }

  it should "push the elements to the Stack" in {
    val result = stack.push(List(12,23,34,45),56)
    val expected = List(12,23,34,45,56)
    assertResult(expected)(result)
  }

  it should "pop the last element from the Stack " in{
    val result = stack.pop(List(12,23,34,45))
    val expected = 45
    assertResult(expected)(result)
  }

  it should "throw NoSuchElementException if we pop in an Empty Queue" in{
    assertThrows[NoSuchElementException]{
      stack.pop(List())
    }
  }

  it should "display the elements present in the Stack " in{
    val result = stack.display(List(12,23,34,45))
    val expected = List(12,23,34,45)
    assertResult(expected)(result)
  }

  it should "work fine with negative elements " in{
    val result = stack.push(List(12,-23,34,-45),-56)
    val expected = List(12,-23,34,-45,-56)
    assertResult(expected)(result)
  }

  it should "return true is stack is Empty" in{
    val result = stack.isEmpty(List())
    val expected = true
    assertResult(expected)(result)
  }

  it should "return false is stack is not Empty" in{
    val result = stack.isEmpty(List(23,34,45))
    val expected = false
    assertResult(expected)(result)
  }
}
