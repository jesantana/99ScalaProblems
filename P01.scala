val list = List(1, 1, 2, 3, 5, 8)

list.last

def findLast(current: List[Int]): Int = {
  current match {
    case Nil => return 0
    case x::Nil => return x
    case x::y => return findLast(current.tail)
  }  
}

findLast(list)