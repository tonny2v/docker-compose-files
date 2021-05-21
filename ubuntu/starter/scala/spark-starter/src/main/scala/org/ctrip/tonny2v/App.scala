package org.ctrip.tonny2v

import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]) {
    val logFile = "data/data.csv" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Application").master("local").getOrCreate
    val logData = spark.read.textFile(logFile).cache
    val numAs = logData.filter(line => line.contains("a")).count
    val numBs = logData.filter(line => line.contains("b")).count
    println(s" ----------- Lines with a: $numAs, Lines with b: $numBs -------------")
    spark.stop()
  }
}
