import java.util

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by apple on 2/14/16.
  */
class ExampleSpec extends FlatSpec with Matchers{

  "A stack" should "pop values in last-in-first-out order" in {
    val stack = new util.Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }
}
