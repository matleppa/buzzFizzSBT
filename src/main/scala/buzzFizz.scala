object buzzFizz extends App {
  def buzzFizz(L: Seq[Int]): Seq[String] = {
    var vastaus = new Array[String](0)

    for (x <- L) {
      var text: String = ""
      if (x % 3 == 0) {
        text = "Buzz"
      }
      if (x % 5 == 0) {
        text += "Fizz"
      }

      if (text.length > 0) {
        vastaus :+= text
      } else {
        vastaus :+= x.toString
      }
    }

    vastaus
  }
}
