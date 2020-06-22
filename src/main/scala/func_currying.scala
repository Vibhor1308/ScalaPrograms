object func_currying {
def main(args:Array[String]):Unit = {
  def add(a:Int)(b:Int) = {
    a+b
  }
  var res = add(10)(20)
  println(res)

}
}
