def isDivisibleBy(k :Int): Int => Boolean = i => i % k == 0

val isEvenFun = isDivisibleBy(2)

//def isEven = isDivisibleBy(2)