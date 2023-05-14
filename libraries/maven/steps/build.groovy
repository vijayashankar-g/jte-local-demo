void call(stageProps){
    stage("Maven: Build"){
        println "build from the maven library"
        println "$stageProps.data"
        println "$stageProps.stageName"
        stageProps.stageName = "Maven"

    }
}