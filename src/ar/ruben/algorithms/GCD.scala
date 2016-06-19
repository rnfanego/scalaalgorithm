package ar.ruben.algorithms

import ar.ruben.algorithms.utils.GCDUtil

/**
  * Created by rfanego on 6/17/16.
  */
object GCD {
  def main(args: Array[String]): Unit = {
    if(args.length != 2){
      print("Deben ingresarse 2 enteros")
      return
    }
    println("Resultado GCD: " + GCDUtil.gcd(args(0).toInt,args(1).toInt))
  }


}
