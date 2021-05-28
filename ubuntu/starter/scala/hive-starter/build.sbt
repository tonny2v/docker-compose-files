/*resolvers ++= Seq(*/
    /*"Cloudera Rel" at "https://repository.cloudera.com/content/repositories/releases/"*/
/*)*/

/*resolvers += "CDH" at "https://repository.cloudera.com/content/repositories/releases/"*/
/*libraryDependencies += "org.apache.hive" % "hive-exec" % "1.1.0-cdh5.8.2"*/

// https://mvnrepository.com/artifact/org.apache.hive/hive-exec
/*libraryDependencies += "org.apache.hive" % "hive-exec" % "1.1.0"*/
libraryDependencies += "org.apache.hive" % "hive-exec" % "3.1.2"
name := "hive-udf"
version := "1.0"
scalaVersion := "2.12.13"
/*unmanagedJars in Compile += file("./lib/hive-exec-1.1.0-cdh5.8.2.1-ctrip-SNAPSHOT.jar")*/
