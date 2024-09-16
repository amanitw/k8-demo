# k8-demo
A demonstration project designed to illustrate key concepts of Kubernetes. This includes following illustrations-
1. Spawinning 1 or more than 1 replicas in a deployment.
2. Using PV and PVC to demonstrate shared persistent storage.
3. Using RBAC to assign/restrict roles for users.
4. Explain about different config yaml files like Dockerfile, deployment yaml, services etc.

# Pre-requisites:
1. Install and start minikube in your local.

# Steps to run this application in your local environment:

1. Go the project root directory.
2. To compile java application run  "javac src/HelloWorld.java"
3. No generate jar file using command "jar cfe src/HelloWorld.jar HelloWorld src/HelloWorld.class"
4. Build the docker image with command "docker build -t amanitw/helloworld-java:latest ." You should use your docker repository username.
5. Push the docker image to repository eg. "docker push amanitw/helloworld-java:latest"
6. Start the deployment using command "kubectl apply -f deployment.yaml".

