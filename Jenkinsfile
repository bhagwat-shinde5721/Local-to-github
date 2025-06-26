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
                bat '''
                    @echo off
                    set "JAVA_HOME=C:\\Program Files\\Java\\jdk-21.0.7"
                    set "PATH=%JAVA_HOME%\\bin;%PATH%"
                    javac BasicJava.java
                '''
            }
        }

        stage('Run Java') {
            steps {
                echo 'Running Java program...'
                bat '''
                 @echo off
                    set "JAVA_HOME=C:\\Program Files\\Java\\jdk-21.0.7"
                    set "PATH=%JAVA_HOME%\\bin;%PATH%"
                    java BasicJava
                '''
            }
        }
    }
}
