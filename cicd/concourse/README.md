## Deploying concourse in your local machine
```bash
wget https://raw.githubusercontent.com/starkandwayne/concourse-tutorial/master/docker-compose.yml
docker-compose up -d
```

## Checking if concourse is running
go to `http://127.0.0.1:8080/`

## Comunication with the concourse API

[fly](https://concourse-ci.org/fly.html) is the concourse cli. With it you could send commands and pipelines to concourse.

This cli is installed through one of the links in `http://127.0.0.1` you are be able to choose between mac, windows and linux.

Once you have downloaded the cli you should add it to your PATH env. In my case:
```bash
sudo mkdir -p /home/ismferd/bin
sudo mv ~/Downloads/fly /home/ismferd/bin
sudo chmod 0755 /home/ismferd/bin/fly
```

Loging to concourse through alias with the target parameter:
```
fly --target playwithconcourse login --concourse-url http://127.0.0.1:8080 -u admin -p admin
logging in to team 'main'


target saved
```

Target means: `Alias of Concourse endpoints, which composes of server url, credentials, etc`.

This config has been saved on `~/.flyrc` file.

## My first pipeline at concourse

Launch: 

```bash
fly -t tutorial set-pipeline -p hello_world -c hello_world_pipeline.yml
```

You will see a new pipeline called hello_world in your concourse dashboard.

`http://127.0.0.1:8080/teams/main/pipelines/hello_world`

