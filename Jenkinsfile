pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS_ID = 'viettranni'
        DOCKERHUB_REPO = 'viettranni/tempeture_assignment'
        DOCKER_IMAGE_TAG = 'latest'
    }

    stages {
        stage('Check Docker') {
            steps {
                sh '/Applications/Docker.app/Contents/Resources/bin/docker --version'
            }
        }

        stage('Debug PATH') {
            steps {
                sh 'echo $PATH'
                sh 'which docker'
            }
        }

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Viettranni/tempeture_week3.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh '/Applications/Docker.app/Contents/Resources/bin/docker build -t ${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG} .'
                }
            }
        }

        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', DOCKERHUB_CREDENTIALS_ID) {
                        sh '/Applications/Docker.app/Contents/Resources/bin/docker push ${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}'
                    }
                }
            }
        }
    }
}