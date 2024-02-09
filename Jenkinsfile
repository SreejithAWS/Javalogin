pipeline {
    agent any
    tools {
        maven 'maven3'
    }
    stages {
        stage('clean workspace') {
            steps {
                    cleanWs()
                }
            }
        stage('Checkout SCM'){
            steps {
                    git branch: 'main', url: 'https://github.com/SreejithAWS/Javalogin.git'
                }
            }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Docker Image build') {
            steps {
                sh 'docker build -t sreejitheyne/tomcat Dockerfile .'
            }
        }

    }

}
