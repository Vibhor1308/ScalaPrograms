object higherorderfunctions {
def main(args:Array[String]):Unit = {
  fucn_exam(25,multiplyby2)
}
  def fucn_exam(i: Int, f:Int=> Any):Unit = {
    print(f(i))
  }

  def multiplyby2(a:Int):Int = {
    a*2
  }
}
