job('NodeJS example') {
    scm {
        git('https://github.com/RuiM94/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('RuiM94')
            node / gitConfigEmail('ruimiguelhortasilva@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
