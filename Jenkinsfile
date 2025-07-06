pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage("Test") {
            steps {
                bat '''
                echo "TestNG runner will start running"
                cd "Maven Project"
                mvn clean test
                '''
            }
        }

        stage("Post Run") {
            steps {
                bat '''
                echo "Execution is successful"
                '''
            }
        }
    }
}
