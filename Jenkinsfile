pipeline {
    agent any
    
    triggers{
        githubPush()
    }
    tools
    {
        jdk 'JDK 21'
    }

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21.0.7'
        PATH = "${env.JAVA_HOME}\\bin;${env.PATH}"
    }
    
    stages {
        stage('Run Java Code') {
            steps {
                bat '''
                echo "Compliling java code"
                 javac BasicJava.java

                echo "Executing java code" 
                 java BasicJava

                '''
            }
        }
        stage('Post run')
        {
            steps
            {
                bat '''
                echo "Execution is successful"
                '''
            }
        }
    }
}
