package funsets

object Main extends App {
  import FunSets._
  //println(contains(singletonSet(1), 1))
  println(singletonSet(20))

  def boundedSet(m: Int, n: Int): Set = x => x >= m && x <= n

  val s = boundedSet(-10, 10)
//  printSet(s) // prints {1,2,3}

  def arbitrarySet(i: Int*): Set = x => i.contains(x)

  val t = arbitrarySet(1, 3, 6)
  printSet(t) // prints {2,4,8}

  println(forall(s, x => x >= -5 && x <= 10111))
  println(exists(s, x => x % 2 == 0))

  println(forall(t, x => x >= 1 && x <= 11))
  println(exists(t, x => x % 2 == 0))
  
  printSet(map(s, x => x + 2))
}
