def call() {
    checkout scm
    echo "Branch: ${env.BRANCH_NAME}"
}