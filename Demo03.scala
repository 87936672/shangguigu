package com.cn

import java.util.StringTokenizer

import scala.collection.mutable


object Demo03 {
  def main(args: Array[String]): Unit = {
    //比较的量
    val strrow=""

    val map = new mutable.HashMap[String,String]()
  //  features
    val str = "{name:[zhang,li],ttsx:[123,njk]}"
   // val str2=str.replaceAll("""\]\,""","""\]\&\&""")
    val foo2 = str.substring(1, str.length - 1).replaceAll("""\]\,""","""\]\&\&""")
    println(foo2)
    val st = new StringTokenizer(foo2, "&&")
    while (st.hasMoreTokens) {
      val thisToken = st.nextToken()
      val st2 = new StringTokenizer(thisToken, ":")
    map.put(st2.nextToken(),st2.nextToken())
    }
//key便利
    val set = map.keySet
    for (k <- set){
     println(k)
    }

    for( (k,v) <- map){ //遍历方式
      println("=========")
      println(k,v)
    }

    //取值map("key")m
    val str3 = map("ttsx")
    println(str3)
    print(map("name"))


  }
}
