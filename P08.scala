val list = List(1, 1, 2, 2, 3, 5, 5, 8)

def eliminateDuplicates(list: List[Int]) = {
  
  def eliminateDuplicatesAcc(currentList: List[Int], currentStrike: Int): List[Int] = {
  		currentList match {
        case Nil => Nil
        case head::tail if(head==currentStrike) => eliminateDuplicatesAcc(tail, currentStrike)
        case head::tail if(head!=currentStrike) => head :: eliminateDuplicatesAcc(tail, head)
      }
  }
  
  eliminateDuplicatesAcc(list, -1)
}

eliminateDuplicates(list)