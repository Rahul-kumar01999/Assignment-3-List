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
//scalastyle:off magic.number
import org.scalatest.flatspec.AnyFlatSpec


class LastElementTest extends AnyFlatSpec {
  val element = new LastElement

  "lastElement" should "return last element as 15 and it's index 4 form List(1,4,12,33,5) "in{
    val result = element.findLastElement(List(1,4,12,33,15))
    assertResult((15,4))(result)
  }

  it should "return the number if list has only one element eg. return (5,0) from List(5)"in{
    assert(element.findLastElement(List(5))==(5,0))
  }

  it should "work with negative numbers also eg. return (-5,4) from List(2,-1,23,54,-5)"in{
    assert(element.findLastElement(List(2,-1,23,54,-5))==(-5,4))
  }

  it should "return (-1,-1) if list is empty or have values other then Integer " in {
    val result = element.findLastElement(List())
    assertResult((-1,-1))(result)
  }
}
