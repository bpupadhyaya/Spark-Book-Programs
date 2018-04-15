package com.equalinformation.spark.scala
import org.apache.spark._


/**
  * Created by bpupadhyaya on 04/14/2018.
  */
object LineCount {
  def main(args: Array[String]): Unit = {
    val inputFileName = args(0)

    val conf = new SparkConf().setMaster("local").setAppName("LineCount")
    val sc = new SparkContext(conf)

    val userRDD = sc.textFile(inputFileName)
    val count = userRDD.count()

    println(count)
  }
}
