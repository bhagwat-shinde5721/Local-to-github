pipline{
    agent any

    tools
    {
        maven  'Maven'
    }
    environment
    {
        bat '''
        echo "In environment change directory to maven project"
        cd Maven Project
        '''
    }
    
    stages{
        stage("Test")
        {
            steps
            {
                bat '''
                echo "TestNG runner will start running"
                mvn clean test
                '''
            }
        }
        stage("Post Run")
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