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
                bat 'javac BasicJava.java'
            }
        }

        stage('Run Java') {
            steps {
                echo 'Running Java program...'
                bat 'java BasicJava'
            }
        }
    }
}
