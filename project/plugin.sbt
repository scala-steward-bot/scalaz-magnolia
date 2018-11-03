addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")
addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "0.2.6")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.10")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.25")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.5.0")
addSbtPlugin("com.eed3si9n" % "sbt-nocomma" % "0.1.0")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-Yno-adapted-args"
)
