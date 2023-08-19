# Java TCP Client-Server Application

## Introduction

This Java TCP client-server application demonstrates a simple file transfer mechanism over a network using a client and a server. The client requests a file from the server, and the server sends the contents of the requested file back to the client.

## Prerequisites

- Java Development Kit (JDK) installed on your computer.
- Basic understanding of Java programming.
- A code editor or integrated development environment (IDE) for Java.

## Usage

### Running the Server

1. Open a terminal or command prompt.

2. Navigate to the directory where the server code (`TCPS.java`) is located.

3. Compile the server code using the following command:

```bash
javac TCPS.java
```
Run the server using the following command:

```bash
java TCPS
```
This will start the server, and it will listen for incoming client connections on port 4000.

### Running the Client

Open another terminal or command prompt.

Navigate to the directory where the client code (TCPC.java) is located.

Compile the client code using the following command:

```bash
javac TCPC.java
```
Run the client using the following command:

```bash
java TCPC
```
The client will prompt you to enter the filename you want to read. Provide the name of a file that exists on the server's file system.

The client will establish a connection with the server, send the filename, and receive and display the content of the requested file.

After the transfer is complete, the client will close the connection.

### Important Notes

Ensure that both the client and server are running on the same network or host.

** Make sure the file you request on the client exists in the directory where the server code is located, or specify the full path to the file on the server in the client's request.**

This is a basic example and lacks error handling, security measures, and advanced features that would be needed for a production environment.

Properly handle exceptions in a production-ready application to enhance reliability.

This code is intended for educational purposes and may require enhancements for production use.

### License

This project is licensed under the [MIT License].
