pipeline {
    agent any
    
    stages {
        stage('Get from git project') {
            steps {
                git 'https://github.com/MaximeCerjak/jenkins_learn.git'
            }
        }
        
        stage('Compile then package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
