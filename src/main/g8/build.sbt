import Dependencies._

lazy val zioVersion = "1.0.0-RC10-1"

lazy val `$name$` = (project in file("."))
  .settings(
    inThisBuild(Seq(
      scalaVersion := "2.13.0",
      version := "0.1.0-SNAPSHOT",
      organization := "com.github.DmytroOrlov"
    )),
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3"),
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioVersion,
      "dev.zio" %% "zio-interop-cats" % "2.0.0.0-RC1",
      "io.monix" %% "monix" % "3.0.0-RC3",
      "org.typelevel" %% "cats-core" % "2.0.0-M4",
      "org.typelevel" %% "cats-mtl-core" % "0.6.0",
      "org.typelevel" %% "cats-tagless-macros" % "0.9",
      scalaTest % Test,
      scalaCheck % Test
    )
  )
