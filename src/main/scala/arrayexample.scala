class arrayexample {
var arr = Array.ofDim[Int](2,2)
  arr(1)(0) = 15

  def show(): Unit ={
    for(i<-0 to 1){
      for(j<-0 to 1){
        print(" " + arr(i)(j))
      }
      println()
    }
  }
}

object obb{
  def main(args:Array[String]): Unit ={
    var a = new arrayexample()
    a.show()
  }
}
