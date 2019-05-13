val list = List(List(1, 1), 2, List(3, List(5, 8)))

val list2 = List(2)

val list3 = List()

def flatten (list: Any) : List[Any] ={
  list match {
    case h :: t => flatten(h) ++ flatten(t)
    case h: List[Any] => h
    case other: Any => List(other)
  }
}


def flatten2 (list: List[Any]) : List[Any] ={
  list match {
    case Nil => Nil
    case (h:List[Any])::t => flatten(h) ::: flatten(t)
    case h::t => h:: flatten(t)
  }
}

flatten(list)
flatten(list2)
flatten(list3)

flatten2(list)