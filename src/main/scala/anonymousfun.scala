object anonymousfun {
def main(args:Array[String]):Unit = {
  var res1 = (a:Int,b:Int) => a + b
  var res2 = (_:Int) + (_:Int)

  println(res1(10,10))
  print(res2(20,30))
}
}
