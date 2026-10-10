pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Checkout') {
      steps {
        echo 'Checkout: nothing to do'
      }
    }
    stage('Prepare') {
      steps {
        echo 'Prepare: nothing to do'
      }
    }
    stage('Lint') {
      steps {
        echo 'Lint: nothing to do'
      }
    }
    stage('Compile') {
      steps {
        echo 'Compile: nothing to do'
      }
    }
    stage('Dependencies') {
      steps {
        echo 'Dependencies: nothing to do'
      }
    }
    stage('Static Analysis') {
      steps {
        echo 'Static Analysis: nothing to do'
      }
    }
    stage('Unit Tests') {
      steps {
        sh './gradlew clean check --no-daemon'
      }
    }
    stage('Integration Tests') {
      steps {
        echo 'Integration Tests: nothing to do'
      }
    }
    stage('Security Scan') {
      steps {
        echo 'Security Scan: nothing to do'
      }
    }
    stage('Package') {
      steps {
        echo 'Package: nothing to do'
      }
    }
    stage('Archive') {
      steps {
        echo 'Archive: nothing to do'
      }
    }
    stage('Publish') {
      steps {
        echo 'Publish: nothing to do'
      }
    }
    stage('Deploy Staging') {
      steps {
        echo 'Deploy Staging: nothing to do'
      }
    }
    stage('Smoke Tests') {
      steps {
        echo 'Smoke Tests: nothing to do'
      }
    }
    stage('Cleanup') {
      steps {
        echo 'Cleanup: nothing to do'
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
