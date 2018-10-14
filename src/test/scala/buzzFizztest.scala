import org.scalatest.FunSuite

class buzzFizztest extends FunSuite {
  test("buzzFizz.buzzFizz") {
    val luvut = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val odotetaan = Seq("1", "2", "Buzz", "4", "Fizz", "Buzz", "7", "8", "Buzz", "Fizz", "11", "Buzz", "13", "14", "BuzzFizz", "16", "17", "Buzz", "19", "Fizz")
    assert(buzzFizz.buzzFizz(luvut) === odotetaan)

    val luvut2 = Seq(-6, -5, -4, -3, -2, -1, 0, 1)
    val odotetaan2 = Seq("Buzz", "Fizz", "-4", "Buzz", "-2", "-1", "BuzzFizz", "1")
    assert(buzzFizz.buzzFizz(luvut2) === odotetaan2)
  }
}
