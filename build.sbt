name := """radna-web"""

version := "1.0-SNAPSHOT"



lazy val root = (project in file(".")).enablePlugins(PlayScala)
    				.aggregate(redisCatalog).dependsOn(redisCatalog)

lazy val redisCatalog = project in file("radna-redis-catalog")


scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

