object scalafunctions {
def main(args:Array[String]):Unit = {
  func()
  val res =  func1()
  println(res)

  val res1= func2(25)
  println(res1)
}
  def func(): Unit ={
    println("This is the first function that I have written")
  }

  def func1():Any = {
    20
  }

  def func2(a:Int):Any = {
    if(a>20)
      55
    else
      65
  }
}
