# TCP Server-Client Chat Application

## Overview

This project is a simple TCP server-client chat application written in Java. It allows a client to connect to a server and exchange messages in real-time. The server can handle multiple clients simultaneously using threads. The client connects to the server and sends messages, which the server then relays to all connected clients.

## Technologies Used

- **Java:** The programming language used to implement the server and client.
- **TCP/IP:** The protocol used for communication between the server and client.
- **Sockets:** Java's `Socket` and `ServerSocket` classes are used to establish the connection and communicate over the network.

## Features

- Multi-threaded server capable of handling multiple clients simultaneously.
- Real-time messaging between client and server.
- Simple and easy-to-understand code structure.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- Any operating system that supports Java.

## How to Run

1. **Clone the repository:**

    ```sh
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Compile the server and client code:**

    ```sh
    javac TCPServer.java
    javac TCPClient.java
    ```

3. **Run the server:**

    ```sh
    java TCPServer
    ```

4. **Run the client:**

    ```sh
    java TCPClient
    ```

5. **Connect the client to the server:**

    - When prompted, type `CONNECT` to establish a connection.

## Usage

- Start the server first to listen for incoming client connections.
- Start the client and type `CONNECT` to connect to the server.
- Once connected, type messages in the client console to send them to the server.
- The server will relay messages to all connected clients.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
## Images while working 
![photo_2024-05-19_10-51-59](https://github.com/Abdelrahman-Elnagar/Server-Client-Chat-Application/assets/126884720/b7ccb38f-630f-403b-8d14-0f093cb6e125)
![photo_2024-05-19_10-51-53](https://github.com/Abdelrahman-Elnagar/Server-Client-Chat-Application/assets/126884720/6957ddf1-3057-4af9-a6e7-8aeaeb588f28)
