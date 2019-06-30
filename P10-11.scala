val list = List(2,2,1,1,1,2,34)
val list2 = List("'a", "'a", "'a", "'a", "'b", "'c", "'c", "'a", "'a", "'d", "'e", "'e", "'e", "'e")

def extractSequences[T](list: List[T]): List[List[T]] = {
  if(list != Nil) {
    val (subList,rest) = list.span(current => current == list.head);
    return subList :: extractSequences(rest)
  }
  
  return Nil
}

def extractFrequencyTuples[T](list: List[T]): List[(Int, T)] = {
  val seq = extractSequences(list)
  seq.map(current => (current.length,current(0)))
}

def extractFrequency[T](list: List[T]): List[Either[(Int, T), T]] = {
  val seq = extractSequences(list)
  seq.map(current => if(current.length > 1)  Left(current.length,current(0)) else Right(current(0)))
}
extractFrequencyTuples(list2)
extractFrequency(list2)