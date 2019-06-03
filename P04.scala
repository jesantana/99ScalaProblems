val list = List(1, 1, 2, 2, 3, 5, 5, 8)

def length(listOfElements: List[Int]) : Int= {
 
  listOfElements match {
    case Nil => 0
    case first :: tail => 1 + length(tail)
  }  
}
