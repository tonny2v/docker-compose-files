package org.ctrip.tonny2v
import org.apache.hadoop.hive.ql.exec.UDF

object MyUdfTest {
	def main(args: Array[String]): Unit = {
		val udf = new MyUdf
		val s = udf.evaluate("hello")
		println(s)
	}
}

class MyUdf extends UDF {
	def evaluate(str: String): String = {
		str.trim
	}
}
