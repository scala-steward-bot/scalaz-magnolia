addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "0.2.5")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.8")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.22")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.4.0")
addSbtPlugin("com.eed3si9n" % "sbt-nocomma" % "0.1.0")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-Yno-adapted-args"
)
