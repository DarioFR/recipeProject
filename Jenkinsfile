#!/usr/bin/env groovy
pipeline {
    agent any //specifica lo specifico nodo jenkins su cui si vuole runnare la pipeline
    tools {
        maven 'MAVEN'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Now Archiving..'
                    archiveArtifacts artifacts: 'target/*.jar'
                }
            }
        }
        stage('Launch docker build') {
            steps {
//                timeout(time: 5, unit: 'DAYS') {
//                    input message: 'Approve JOB?', submitter: 'dariowrn'
//                }
               sh '/usr/local/bin/docker build -t recipesservice-jenkins .'
            }
            post {
                success {
                    echo 'Success!!!'
                }
                failure {
                    echo 'Failed!!!'
                }
            }
        }
    }

}