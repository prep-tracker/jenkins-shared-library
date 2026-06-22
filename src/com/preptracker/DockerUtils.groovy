package com.preptracker

class DockerUtils implements Serializable {
    def steps

    DockerUtils(steps) {
        this.steps = steps
    }

    def dockerImage(String image){
        steps.sh """
            docker image build -t ${image} .
        """
    }
}