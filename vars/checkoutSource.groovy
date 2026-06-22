def call() {
    echo "Branch: ${env.BRANCH_NAME}"
    env.GIT_SHA = sh(
            script: "git rev-parse --short HEAD",
            returnStdout: true
    ).trim()
}