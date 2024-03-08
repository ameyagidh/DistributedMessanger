# Distributed Messenger

Distributed Messenger is a peer-to-peer chat system that allows users to communicate with each other in real-time. It provides features such as sending messages, sharing files, and creating chat groups. Since the system is entirely peer-to-peer, users can run multiple instances of the application and connect to each other using groups.

## Build and Run

To run Distributed Messenger, follow these steps:

1. Compile and run the `ChatSwingMain.java` file.
2. Create a chat room by specifying a port number.
3. Allow other instances of the application to connect to this room by sharing the port number.
4. Users can join the chat room, share data, files, and communicate with other peers in the group.

## Features

- **Peer-to-Peer Communication:** Users can communicate directly with each other without relying on a central server.
- **Messaging:** Send and receive messages in real-time within the chat groups.
- **File Sharing:** Share files with other users in the chat groups.
- **Group Creation:** Create chat groups and invite other users to join.
- **Logging:** Activities and events happening on the server are logged and saved on a per-user basis in the `app_data` directory.

## Usage

1. Launch the application and specify a port number to create a chat room.
2. Share the port number with other users who want to join the chat room.
3. Users can join the chat room by entering the port number and connecting to the server.
4. Once connected, users can send messages, share files, and interact with other peers in the group.

## Logging

The system logs activities and events in log files, which are saved on a per-user basis in the `app_data` directory. Users can monitor the server's activities by inspecting these log files.