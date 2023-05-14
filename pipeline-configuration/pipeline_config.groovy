@merge libraries{
  	sonar
}

if(buildType == "full"){
    stages{
        steps{
            build()
            static()
        }
    }
}
elseif(buildType == "buildOnly"){
      stages{
        steps{
            build()
        }
    }
}
