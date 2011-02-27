package ch.mollusca.scribe

import org.scalatest._
import org.scalatest.matchers._

class SimpleSpec extends Spec with ShouldMatchers {
  describe("A Spec"){
    it("should not err on comparisons"){
      List(1,2,3) should equal (List(1,2,3) )
    }
  }
  
  describe("A Set"){
    it("should be the same, no matter what order the elements are added"){
      Set(1,2,3) should equal( Set(3,2,1) )
      Set(1,2,3) should equal( Set(3,2,3,2,3,2,3,2,3,1) )
    }
  }
  
  describe("A List"){
    it("can return a Traversable with a filter"){
      val list = List.range(1,100)
      val odd = list.withFilter( _%2 != 0 )
      odd.foreach {
        _ %2 == 0 should be( false )
      }
    }
    
    it("can be partitioned via a predicate"){
      val list = List.range(1,10)
      val (even, odd) = list.partition( _%2==0 )
      even should equal( List(2,4,6,8) )
      odd should equal( List(1,3,5,7,9) )
    }
  }
}