pipeline {
  agent any
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
