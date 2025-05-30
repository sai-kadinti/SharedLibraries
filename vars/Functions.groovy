def cdown(repo)
{
    git 'https://github.com/sai-kadinti/${repo}'
}

def cbuild(mvn_stage)
{
    sh 'mvn ${mvn_stage}'
}

def cdeploy(job_name,ip,path)
{
    sh 'scp /var/lib/jenkins/workspace/${job_name}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${path}.war'
}

 
