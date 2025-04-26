# Quarkus Application with GitHub Actions
 
This repository contains a Quarkus application that uses Maven for build automation and GitHub Actions for Continuous Integration (CI).
 
## **Project Overview**

This project demonstrates how to set up a Quarkus application, build it using Maven, and automate the process using GitHub Actions.
 
## **Why GitHub Actions?**

I chose **GitHub Actions** for several reasons:

- **Admin Rights Required for Local Setup**: Setting up Maven, JDK, and dependencies locally required admin rights, which I didn’t have access to at the time. GitHub Actions allowed me to bypass this.

- **Automation**: GitHub Actions automates the build and deployment process, ensuring that every change is tested and built without manual intervention.

- **Seamless Integration**: GitHub Actions integrates directly with GitHub, making it easy to monitor and track builds alongside the code repository.
 
## **How to Build and Check the Project**
 
### 1. **GitHub Actions Workflow**
 
A workflow has been set up in GitHub Actions to automate the building and testing of the project. The workflow runs automatically whenever changes are pushed to the `main` branch.
 
- **Workflow Name**: Java CI with Maven

- **Actions Triggered**: 

  - On push to the `main` branch

  - On pull request to the `main` branch
 
### 2. **Check Build Status**

To verify that the build has run successfully:

1. Go to the **Actions** tab in this GitHub repository.

2. Find the most recent run under the **"Java CI with Maven"** workflow.

3. Click on it to view the build logs and confirm success. You should see an output like this:

4. ![image](https://github.com/user-attachments/assets/f7224967-9862-407e-aae2-27254b079f75)

5. 

### 3. **Local Build (if Admin Access Available)**

If you have access to set up your environment:

- Install **Java 17** and **Maven** locally.

- Clone the repository:

git clone https://github.com/your-username/your-repo-name.git

 
Build the project:
 
mvn clean install

 
Run the Java application:
 
java -cp target/classes com.example.Main

 
Here’s an example of what you might see in the logs after the build is successful
🚀 Maven Build Success!
Hello from Quarkus!
 
 
Conclusion
This repository demonstrates the full process of building a Quarkus application using Maven and automating it with GitHub Actions. By using GitHub Actions, the entire CI/CD pipeline is streamlined and efficient.
 
About the Author
This Assignment was done by Saniya Salwa
