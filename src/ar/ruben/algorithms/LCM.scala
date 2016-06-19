package ar.ruben.algorithms

import ar.ruben.algorithms.utils.GCDUtil

/**
  * Created by rfanego on 6/18/16.
  */
object LCM {
  def main(args: Array[String]): Unit = {
    if(args.length != 2){
      print("Deben ingresarse 2 enteros")
      return
    }

    val a = args(0).toInt
    val b = args(1).toInt
    val result = (a * b) / GCDUtil.gcd(a,b)
    println(s"Resultado LCM para $a y $b: $result")
  }
}
