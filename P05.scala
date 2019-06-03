import scala.annotation.tailrec

val list = List(1, 1, 2, 2, 3, 5, 5, 8)


def reverse(listToReverse: List[Int]) : List[Int] = {
 
  listToReverse match {
    case Nil => Nil
    case first :: tail => reverse(tail) ::: List(first)
  }
  
}


def reverseTailRec(listToReverse: List[Int]) : List[Int] = {
 	
  @tailrec
  def reverseTailRecInternal(listToReverse: List[Int], resultList: List[Int]) : List[Int] = {
 
        listToReverse match {
            case Nil => resultList
            case first :: tail => reverseTailRecInternal(tail, first :: resultList) 
        }
  
    } 
  
  reverseTailRecInternal(list, List())
}
