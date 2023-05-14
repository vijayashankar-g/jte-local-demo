@merge libraries{
  	sonar
}


    stages{
        continuous_integration{
            build(stageProps)
            static_build(stageProps)
        }
        ci_minimal{
            build(stageProps)
        }
    }
}
