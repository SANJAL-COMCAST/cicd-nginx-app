pipelineJob('nginx-cicd-pipeline') {

    definition {

        cpsScm {

            scm {

                git {

                    remote {
                        url('https://github.com/SANJAL-COMCAST/cicd-nginx-app.git')
                    }

                    branches('*/main')
                }
            }

            scriptPath('app/Jenkinsfile')
        }
    }

    triggers {
        scm('H/2 * * * *')
    }

    description('NGINX CI/CD Pipeline created using Job DSL')
}