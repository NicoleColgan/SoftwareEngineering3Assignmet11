pipeline {
    agent any
    stages {
        stage ('Compile Stage'){
            steps {
                bat './gradlew build'
            }
        }
    }
    post{
            success{
            deploy(adapters:[tomcat9(url:"http://localhost:8081",credentialsId:"TOMCAT",path:"")], war:"**/build/libs/*.war", contextPath:"")
            }
        }
}