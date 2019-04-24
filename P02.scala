val list = List(1, 1, 2, 3, 5, 8)

def penultimate(listOfElements: List[Int]): Int = {
  listOfElements match {
    case Nil => throw new NoSuchElementException
    case x1 :: x2 :: Nil => x1
    case x1 => penultimate(x1.tail)
  }
}

penultimate(list)