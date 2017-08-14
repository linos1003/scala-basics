/**
  * Created by bsmida on 14/08/17.
  */
object MainFold extends App {

  val numbers = List(1, 2, 11, 9, 100, 90, 33, 67)
  val result = numbers.fold(0) { (x, y) => x + y }
  print(result)
}
