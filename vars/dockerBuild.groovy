import com.preptracker.DockerUtils

def call(Map config = [:]){
    def docker = new DockerUtils(this)

    docker.dockerImage(){
        "${config.registry}/${config.serviceName}:${config.imageTag}"
    }
}