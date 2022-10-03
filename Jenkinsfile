pipeline {
//agent instructs jenkins to allocate an executor
//(allows  the build to run)
//and workspace for the entire pipeline
    agent any
     stages {
        stage ('Build'){
            steps {
                bat './gradlew build'
            }
        }
    }
    post{
            success{
            deploy(adapters:[tomcat9(url:"http://localhost:8087",credentialsId:"TOMCAT",path:"")], war:"**/build/libs/*.war", contextPath:"")
            }
        }
}