pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Build') {
      steps {
        sh './gradlew clean check --no-daemon'
      }
    }
    stage('Test') {
      steps {
        sh "mvn -Dmaven.test.failure.ignore=true clean package"
      }
    }
  }
  post {
    always {
        testNG()
        junit(
          allowEmptyResults: true, 
          testResults: '**/build/test-results/test/*.xml'
        )
        recordIssues(
          enabledForFailure: true, aggregatingResults: true, 
          tools: [java(), checkStyle(pattern: '**/build/**/main.xml', reportEncoding: 'UTF-8')]
        )
    }
  }
}
