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
  }
  post {
    always {
        junit(
          allowEmptyResults: true, 
          skipPublishingChecks: true,
          testResults: '**/build/test-junit-xml/*.xml'
        )
    }
  }
}
