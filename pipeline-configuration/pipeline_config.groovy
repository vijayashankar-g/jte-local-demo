@merge libraries{
  	sonar
}


stages{
    continuous_integration{
        build
        static_build
    }
    ci_minimal(stageProps){
        build(stageProps)
    }
}
