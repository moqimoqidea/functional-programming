// 查找回文词，Scala 实现
def isPalindrome(x: String) = x == x.reverse

def findPalindrome(s: Seq[String]) = s find isPalindrome
