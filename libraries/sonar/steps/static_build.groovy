void call(stageProps){
    stage("Static Code Analysis"){
        println "static code analysis"
        println stageProps.data
        println stageProps.stageName
        stageProps.stageName = "Maven"
    }
}