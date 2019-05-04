val list = List(1, 1, 2, 3, 5, 8)

def kElement(listOfElements: List[Int], k: Int) : Int= {
  
  if(k > listOfElements.length) {
    throw new RuntimeException()
  }
  
  if(k == 1) {
    return listOfElements.head
  } else {
    return kElement(listOfElements.tail, k-1)
  }
  
}

def kElement1(k: Int, listOfElements: List[Int]) : Int= {
  
  (k, listOfElements) match {
    case (x, Nil) => throw new RuntimeException()
    case (1, first::tail) => first
    case (x, first::tail) => kElement(x-1, tail)
  }
  
}

kElement(list, 4)
kElement1(list, 4)