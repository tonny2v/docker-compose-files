package org.ctrip.tonny2v

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

object App {
  def main(args: Array[String]): Unit = {
    val streamEnv: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment
    import org.apache.flink.streaming.api.scala._
    
    // nc -lk 9999
    val stream: DataStream[String] = streamEnv.socketTextStream("localhost", 9999)
    
    val result:DataStream[(String, Int)] = stream.flatMap(_.split(" "))
      .map((_, 1))
      .keyBy(0)
      .sum(1)
    
    result.print("res")
    
    streamEnv.execute("wordCount")
  }
}

