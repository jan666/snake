name := "snake"

organization := "de.htwg"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

libraryDependencies ++= Seq(
		"org.specs2" %% "specs2" % "1.12.3" % "test",
		"junit" % "junit" % "4.7" % "test"
	)
	
	libraryDependencies <+= scalaVersion { "org.scala-lang" % "scala-swing" % _ }


	resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases")