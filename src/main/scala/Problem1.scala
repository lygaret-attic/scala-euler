package com.github.lygaret.euler

object Problem1 extends App {

	val r = (1 until 100).view

	val threes = r.filter(_ % 3 == 0)
	val fives  = r.filter(_ % 5 == 0)

	val all = threes ++ fives

	// distinct doesnt work on views (lazy collections), so we'll force it to a list

	val sum = all.toList.distinct.fold(0)(_ + _)
	Console.println("sum: " + sum)

}
