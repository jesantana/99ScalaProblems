val list2 = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

def decode[T](list: List[(Int,T)]): List[T] = {
  list.flatMap(current => List.fill(current._1)(current._2))
}

decode(list2)