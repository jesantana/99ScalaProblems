val list = List(1, 2, 3, 2, 1)

def isPalindrome(list: List[Int]): Boolean ={
  list match {
    case Nil => true
    case x :: Nil => true
    case head +: list :+ last => head ==last && isPalindrome(list)
  }
}

isPalindrome(list)