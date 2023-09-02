package io.eleutherius

object CollectionsTest extends App {

  //  val list = List(1, 2, 3)
  //
  //  println(list :+ 4)
  //  println(list :+ 4 :+ 5)
  //  println(1 +: list)
  //  println(1 +: 2 +: list)
  //  println(1 :: 2 :: 3 :: 4 :: Nil)

  //  println((1 to 10).toList)
  val states = scala.collection.mutable.Map(
    "AL" -> "Alabama",
    "AK" -> "Alaska"
  )

  // add elements with +=
  states += ("AZ" -> "Arizona")
  states ++= Map("CO" -> "Colorado", "KY" -> "Kentucky")

  val p = states.filterInPlace((k, v) => k != "AK")

  println(p)
}
