def call(Map config = [:]) {
    stage('Checkout'){}
    stage('Maven Build'){}
    stage('Unit Testing'){}
    stage('Sonar'){}
    stage('Coverage') {}
    stage('Quality Gate') {}
}