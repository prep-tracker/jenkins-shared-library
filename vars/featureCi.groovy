def call(Map config = [:]) {
    stage('Checkout') {
        checkoutSource()
        echo "Branch: ${config.serviceName}"
    }
//    stage('Maven Build'){}
//    stage('Unit Testing'){}
//    stage('Sonar'){}
//    stage('Git leaks'){}
//    stage('dependency Check'){}
//    stage('Docker Build'){}
//    stage('Trivy Scan'){}
}