@merge libraries{
  	sonar
}


stages{
    continuous_integration(stageProps){
        build
        static_build
    }
    ci_minimal(stageProps){
        build(stageProps)
    }
}
