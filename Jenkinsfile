pipeline {
//agent instructs jenkins to allocate an executor
//(allows  the build to run)
//and workspace for the entire pipeline
    agent any
     stages {
//         stage('Checkout code from Git repo'){
//             steps{
//                 checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-token', url: 'https://github.com/NicoleColgan/SoftwareEngineering3Assignmet1b.git']]])
//             }
//         }
        stage ('Build'){
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