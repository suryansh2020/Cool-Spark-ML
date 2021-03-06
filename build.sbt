name := "SparkML"

version := "0.1"

scalaVersion := "2.11.12"
val sparkVersion = "2.4.5"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "org.apache.spark" %% "spark-mllib" % sparkVersion,
    "org.scalanlp" %% "breeze" % "1.0",
    "org.scalanlp" %% "breeze-natives" % "1.0",
    "org.scalanlp" %% "breeze-viz" % "1.0",
    "org.vegas-viz" %% "vegas" % "0.3.11",
    "org.vegas-viz" %% "vegas-spark" % "0.3.11"
)