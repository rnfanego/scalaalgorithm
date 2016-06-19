package ar.ruben.algorithms.utils

/**
  * Created by rfanego on 6/18/16.
  */
object GCDUtil {
  def gcd(a: Int,b: Int): Int = {
    if(b != 0){
      val resto = a % b
      println(s"resto: $resto")
      gcd(b,resto)
    }else{
      return a
    }
  }
}
