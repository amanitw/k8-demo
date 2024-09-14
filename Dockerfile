# Use an official OpenJDK runtime as a parent image
FROM openjdk:18-oracle

# Set the working directory in the container
WORKDIR /app

# Copy the Java application JAR file to the container
COPY src/HelloWorld.jar /app/HelloWorld.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "HelloWorld.jar"]