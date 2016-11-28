name := """radna-redis-catalog"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val redisCatalog = (project in file(".")).aggregate(catalogModel).dependsOn(catalogModel)

lazy val catalogModel = project in file("radna-catalog")

val redisClient =   "net.debasishg" %% "redisclient" % "3.2"

val bdd = "org.scalatest" %% "scalatest" % "2.2.4" % "test"

val akka = "com.typesafe.akka" %% "akka-actor" % "2.3.11"

libraryDependencies ++= Seq(
	redisClient,
	//akka,
	bdd
	) 

