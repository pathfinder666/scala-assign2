package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c > r) throw new NoSuchElementException
    else if (c == 0) 1
    else if (c == r) 1
    else pascal(c -1, r) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(balancedInt: Int, list: List[Char]): Boolean = {
      if(list.isEmpty) {
        if (balancedInt == 0) true
        else false
      }
      else{
        if(list.head == ')'){
          if(balancedInt == 0) false
          else loop(balancedInt - 1, list.tail)
        }
        else if(list.head == '(') loop(balancedInt + 1, list.tail)
        else loop(balancedInt, list.tail)
      }
    }
    
    loop(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
