object buzzFizz extends App {
  def buzzFizz(L: Seq[Int]): Seq[String] = {
    /*
    * Incoming: array of integers
    * Ougoing: array of strings. Integers divisible by three are replaced with "Buzz"
    *          Integers divisible by five are replaced by "Fizz". "BuzzFizz" if both.
    * */

    // initiate the response array of strings
    var vastaus = new Array[String](0)

    // handle incoming array in loop
    for (x <- L) {
      // initiate variable for possible Fizz or Buzz text
      var text: String = ""

      // if divisible by 3, text needed for replacement
      if (x % 3 == 0) {
        text = "Buzz"
      }

      // if divisible by 5, text needed for replacement
      // note: might have been also divisible by 3, so let's append this text
      if (x % 5 == 0) {
        text += "Fizz"
      }

      // append to response array either replacement text or the number
      if (text.length > 0) {
        vastaus :+= text
      } else {
        vastaus :+= x.toString
      }
    }

    // return response array
    vastaus
  }
}
