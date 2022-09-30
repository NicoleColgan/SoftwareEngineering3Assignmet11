pipeline {
    agent any
    stages {
        stage ('Compile Stage'){
            steps {
                bat './gradlew build'
            }
        }
    }
//     post{
//             success{
//             deploy(adapters:[tomcat9(url:"http://localhost:8081",credentialsId:"TOMCAT",path:"")], war:"**/build/libs/*.war", contextPath:"")
//             }
//         }
post {
    success {
      echo "Triggered post-success"
    }
    failure {
      echo "Triggered post-failure"
    }
    unstable {
      echo "Triggered post-unstable"
    }
    aborted {
      echo "Triggered post-aborted"
    }
  }
}