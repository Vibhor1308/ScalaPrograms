class thisexample {

  def sum (a:Int, b:Int): Int ={
     var res = a+b
    res
  }

  def sum(a:Int, b:Int, c :Int):Int = {
    var res = a+b+c
    res
  }

}

object myobject{
  def main(args:Array[String]): Unit ={
    var res1 = new thisexample()
    var res2 = new thisexample()
    var a = res1.sum(10,20)
    println(a)
    var b = res2.sum(10,20,30)
    println(b)
  }
}
