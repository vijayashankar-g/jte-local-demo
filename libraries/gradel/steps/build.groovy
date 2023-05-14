void call(stageProps){
    stage("Graddle: Build"){
        println "build from the Graddle library"
        println stageProps.data
        println stageProps.stageName
        stageProps.stageName = "Graddle"
        println appType
    }
}