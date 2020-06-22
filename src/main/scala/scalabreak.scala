//import scala.util.control.Breaks._
object scalabreak {
def main(args:Array[String]):Unit = {
  for(i<-1 to 10){
    if(i == 7)
      scalabreak
    else
      println(i)
  }
}
}
