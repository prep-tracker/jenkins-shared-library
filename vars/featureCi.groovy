def call(Map config = [:]) {
    stage('Build Context') {
        checkoutSource()
        echo "Service: ${config.serviceName}"
    }
//    stage('Maven Build'){}
//    stage('Unit Testing'){}
//    stage('Sonar'){}
//    stage('Git leaks'){}
//    stage('dependency Check'){}
//    stage('Docker Build'){}
//    stage('Trivy Scan'){}
}