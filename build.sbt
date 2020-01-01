name := """crud"""
organization := "uk.co.ijump"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "com.typesafe.play" %% "play-slick" % "4.0.0"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "uk.co.ijump.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "uk.co.ijump.binders._"

// General
// https://www.reddit.com/r/scala/comments/4kokyk/how_do_i_get_playslick_20_to_work/
// https://pedrorijo.com/blog/play-slick-updated/
// https://www.playframework.com/documentation/2.8.x/PlaySlick
// https://dzone.com/articles/installing-openjdk-11-on-macos
// https://i4t.org/2017/06/19/spring-boot-postgresql-setup-using-gradle/
// https://www.lagomframework.com/
// https://stackoverflow.com/questions/2419566/best-way-to-use-multiple-ssh-private-keys-on-one-client
// http://osxdaily.com/2016/06/07/reload-bash_profile-zsh-profiles-command-line/

// Building an API
// https://developer.lightbend.com/guides/play-rest-api/part-1/index.html


// Kafka
// https://medium.com/rahasak/kafka-and-zookeeper-with-docker-65cff2c2c34f

