object recursivefunction {
def main(args:Array[String]):Unit = {
  val res = find_factorial(5)
  print(res)
}
  def find_factorial(i: Int):Int = {
    if(i<=1)
      1
    else
       i * find_factorial(i-1)
  }
}
