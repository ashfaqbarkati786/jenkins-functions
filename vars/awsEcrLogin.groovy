def call(String region, String registry, String credsId) {
    withCredentials([[$class: 'AmazonWebServicesCredentialsBinding',
                      credentialsId: credsId]]) {
        sh """
            aws ecr get-login-password --region ${region} \
            | docker login --username AWS --password-stdin ${registry}
        """
    }
}
