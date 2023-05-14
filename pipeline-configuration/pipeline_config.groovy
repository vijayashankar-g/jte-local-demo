@merge libraries{
  	sonar
}

def stageProps = [
	"data" : "init"
]

if(buildType == "full"){
    stages{
        continuous_integration{
            build(stageProps)
            static(stageProps)
        }
    }
}
elseif(buildType == "buildOnly"){
    stages{
        continuous_integration{
            build(stageProps)
        }
    }
}
