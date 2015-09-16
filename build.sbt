name := "rolling-scene"

version := "0.1-SNAPSHOT"

resolvers += "repo.codahale.com" at "http://repo.codahale.com"

libraryDependencies ++= Seq(
    "log4j"              %   "log4j"                  % "1.2.16"
)


libraryDependencies ++= Seq(
    "junit"                 %   "junit"                 % "4.8.2"     % "test",
    "org.mockito"           %   "mockito-all"           % "1.9.5"     % "test",
    "org.scalatest"         %%  "scalatest"             % "2.0"       % "test"
)
