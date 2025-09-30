def call(String imageName, String imageTag, String registry) {
    sh """
        docker push ${registry}/${imageName}:${imageTag}
    """
}
