name := """Convert Getter"""
libraryDependencies ++= Seq(
   "junit" % "junit" % "4.12" % Test,
   "com.novocode" % "junit-interface" % "0.10" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-a")