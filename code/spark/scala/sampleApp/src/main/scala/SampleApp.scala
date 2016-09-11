import org.apache.spark.SparkContext, org.apache.spark.SparkConf
object SampleApp{
def main(args: Array[String]){
val conf= new SparkConf().setAppName("scala simple")
val sc = new SparkContext(conf)
val dataRDD = sc.textFile("/user/cloudera/sqoop_import/departments")
dataRDD.saveAsTextFile("/user/cloudera/spark/scala/simpleApp/departments")
}
}
