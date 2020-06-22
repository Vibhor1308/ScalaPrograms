object foryield {
def main(args:Array[String]):Unit = {
  var result = for(i<-1 to 10) yield i
  println(result)
  for(i<-result)
    println(i)
}
}
