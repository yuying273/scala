/*
* sum function
* @param xs A list of natural numbers
* @return The sum of all elements in `xs`
*/
    def sum(xs: List[Int]): Int ={
      def loop(acc: Int, xs: List[Int]): Int = {
        if (xs.head.isEmpty) acc
        else loop(acc + xs.head, xs.tail)
      }
      loop(0,xs)
    }
  
  val x = List(1,2,3)
  sum(x)
  
    /**
   * This method returns the largest element in a list of integers. If the
   * list `xs` is empty it throws a `java.util.NoSuchElementException`.
   * @param xs A list of natural numbers
   * @return The largest element in `xs`
   * @throws java.util.NoSuchElementException if `xs` is an empty list
   */
    def max(xs: List[Int]): Int = {
      def loop(value1: Int, xs: List[Int]): Int = {
      if (xs.isEmpty) { value1 }
      else if (value1 >= xs.head) { loop(value1, xs.tail) } else
        loop(xs.head, xs.tail)
      }
      loop(xs.head, xs.tail)
    }
  }
  
 max(x)
