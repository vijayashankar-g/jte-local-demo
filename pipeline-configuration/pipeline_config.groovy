@merge libraries{
  	sonar
}

if(buildType == "full"){
    stages{
        continuous_integration{
            build()
            static()
        }
    }
}
elseif(buildType == "buildOnly"){
    stages{
        continuous_integration{
            build()
        }
    }
}
