pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clone your code
                checkout scm
            }
        }

        stage('Compile Java') {
            steps {
                echo 'Compiling Java code...'
                sh 'javac BasicJava.java'
            }
        }

        stage('Run Java') {
            steps {
                echo 'Running Java program...'
                sh 'java BasicJava'
            }
        }
    }
}
