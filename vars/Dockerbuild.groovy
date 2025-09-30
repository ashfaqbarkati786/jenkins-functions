def call(String imageName, String imageTag, String registry) {
    sh """
        docker build -t ${imageName}:${imageTag} .
        docker tag ${imageName}:${imageTag} ${registry}/${imageName}:${imageTag}
    """
}
