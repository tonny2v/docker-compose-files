!ln -s /usr/lib/hive/lib/hive-exec-1.1.0-cdh5.8.2.1-ctrip-SNAPSHOT.jar ./hive-exec-1.1.0-cdh5.8.2.1-ctrip-SNAPSHOT.jar
!hdfs dfs -rm ./hive-udf_2.12-1.0.jar /user/bitrain/jar/tonny/hive-udf_2.12-1.0.jar
!hdfs dfs -put ./hive-udf_2.12-1.0.jar /user/bitrain/jar/tonny

!hdfs dfs -ls /user/bitrain/jar/tonny

!hive -e "ADD JAR hdfs:///user/bitrain/jar/tonny/hive-udf_2.12-1.0.jar; create temporary function trim as 'org.ctrip.tonny2v.MyUdf';select trim('hello')"
