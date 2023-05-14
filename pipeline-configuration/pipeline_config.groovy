@merge libraries{
  	sonar
}


stages{
    continuous_integration{
        build
        static_build
    }
    ci_minimal{
        build(stageProps)
    }
}
