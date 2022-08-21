# serve-api

### To run locally:
    
    mkdir myProjects

    cd myProjects

    git clone https://github.com/tsiupa-coder/serve-api.git

    cd api

    sudo systemctl start elasticsearch

    sdk use java 18.0.2-open
    
    mvn install

    java -jar target/api-0.0.1-SNAPSHOT.jar

    Ctrl + C to stop or sudo kill -9 $(sudo lsof -t -i:8085); - in case of emergency

### Or with docker

    mkdir myProjects

    cd myProjects

    git clone https://github.com/tsiupa-coder/serve-api.git

    cd api

    mvn spring-boot:build-image


### Requirements

    java 18

    maven 3.8.6

    SDKMAN 5.16.0

    elasticsearch


### prepare postgresql

    sudo -u postgres psql;
    create database serveApi;
    create user apiuser with encrypted password 'apiuser';
    grant all privileges on database serveApi to apiuser;
    
