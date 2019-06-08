val list = List(2,2,1,1,1,2,34)
val list2 = List()

def testMultipleMatch(l1: List[Int], l2: List[Int]) ={
  (l1, l2) match {
    case (h::t, Nil) => println("First")
    case (Nil, h::t) => println("Second")
    case (h::t, h2::t2) => println("Both")
    case (Nil, Nil) => println("None")
  }
}

def extractSequences(list: List[Int]): List[List[Int]] = {
  if(list != Nil) {
    val (subList,rest) = list.span(current => current == list.head);
    return subList :: extractSequences(rest)
  }
  
  return Nil
}