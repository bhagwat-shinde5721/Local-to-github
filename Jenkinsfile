pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone your code
                checkout scm
            }
        }

        stage('Build') {
            steps {
                 echo 'Valiating maven installation...'
                bat '''
                   mvn --version
                    
                '''
            }
        }

        
    }
}
