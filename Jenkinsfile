pipeline {
    agent any
    
    tools {
        maven 'Maven' // Assurez-vous que 'Maven' correspond au nom de l'installation Maven configuré dans Jenkins.
    }
    
    stages {
        stage('Get from git project') {
            steps {
                git 'https://github.com/MezghichGit/mavenJunitProject'
            }
        }
        
        stage('Compile then package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
