pipeline {
    agent any
    tools {
        maven 'MAVEN'
        jdk 'JDK17'
    }


    stages {
        stage('Checkout') {
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/repoe2e/library-rest.git']]])
            }
        }
        stage('Build') {
            steps {
                script {
                    // Executa o comando Maven para construir o projeto
                    sh 'mvn clean package'
                }
            }
        }
        stage('API TEST') {
            steps {
                script {
                    // Executa os testes de API usando Maven
                    sh 'mvn test'
                }
            }
        }
    }
}
