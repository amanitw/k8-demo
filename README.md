# k8-demo
A demonstration project designed to illustrate key concepts of Kubernetes.

Pre-requisites:
a. Install and start minikube in your local.

Steps to run this application in your local environment:

a. Go the project root directory.
b. To compile java application run  "javac src/HelloWorld.java"
c. No generate jar file using command "jar cfe src/HelloWorld.jar HelloWorld src/HelloWorld.class"
d. Build the docker image with command "docker build -t amanitw/helloworld-java:latest ." You should use your docker repository username.
e. Push the docker image to repository eg. "docker push amanitw/helloworld-java:latest"
f. Start the deployment using command "kubectl apply -f deployment.yaml".

