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
package com.knoldus.ElementTable

//scalastyle:off magic.number
import org.scalatest.flatspec.AnyFlatSpec

class ElementTableTest extends AnyFlatSpec{
 val element= new ElementTable

  "ElementTable" should "return table of each element in the form of List" in{
    val resultList = element.table(List(2,3,4))
    val expectedList = List(
      List(2,4,6,8,10,12,14,16,18,20),
      List(3,6,9,12,15,18,21,24,27,30),
      List(4,8,12,16,20,24,28,32,36,40)
    )
    assertResult(expectedList)(resultList)
  }

  it should "return empty list for empty list as input " in{
    val resultList = element.table(List())
    val expectedList = List()
    assertResult(expectedList)(resultList)
  }

  it should " return negative table for negative element in List" in{
    val resultList = element.table(List(-2,3,-4))
    val expectedList = List(
      List(-2,-4,-6,-8,-10,-12,-14,-16,-18,-20),
      List(3,6,9,12,15,18,21,24,27,30),
      List(-4,-8,-12,-16,-20,-24,-28,-32,-36,-40)
    )
    assertResult(expectedList)(resultList)
  }

  it should " return zero List table for 0 as an input" in{
    val resultList = element.table(List(0))
    val expectedList = List(
      List(0,0,0,0,0,0,0,0,0,0)
    )
    assertResult(expectedList)(resultList)
  }
}
