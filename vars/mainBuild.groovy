def call(Map config = [:]) {
    stage('Checkout'){}
    stage('Maven Build') {}
    stage('Unit Testing'){}
    stage('Integration Testing'){}
    stage('Docker Build'){}
    stage('Trivy Scan'){}
    stage('Docker push'){}
    stage('Deploy DEV') {}
}