# Multithreaded-Chat

"Company":CODTECH IT Solutions

Name: Bezawada Thanishma

Intern ID:CT04DN1543

"Domain":JAVA Programming

"Duration":8 weeks

"Mentor":Neela Santhosh Kumar

Description: This project is a multithreaded chat application built using Java that enables real-time communication between multiple clients through a centralized server. It demonstrates the use of Java's socket programming and multithreading features to implement a simple yet effective messaging system. The application comprises two main components: the Chatserver.java file, which acts as the server, and the Chatclient.java file, which acts as the client. The server uses a ServerSocket to listen on a specific port (port 1234) and waits for incoming client connections. When a client connects, a new thread is created using a ClientHandler class that implements the Runnable interface, allowing the server to handle multiple clients simultaneously without blocking other connections. Each connected client is managed in its own thread, and the server maintains a set of all active clients. When a message is received from one client, the server broadcasts it to all other connected clients, enabling a real-time group chat environment. On the client side, the application creates a socket connection to the server and uses one thread to read input from the user and send it to the server, while another thread listens for incoming messages from the server and displays them in the console. This parallelism ensures smooth two-way communication. The project uses core Java features such as Socket, ServerSocket, BufferedReader, PrintWriter, and Java collections like HashSet to manage client sessions. It is designed to be run entirely in the command line: users compile both Java files using javac Chatserver.java Chatclient.java, start the server with java Chatserver, and then start one or more clients using java Chatclient. It is a perfect project for beginners who want to learn about networking, concurrency, and I/O in Java. The code is clean, modular, and well-structured, making it easy to understand and modify. This chat application also serves as a foundation for more advanced features such as private messaging, message encryption, authentication, user management, and graphical interfaces using JavaFX or Swing. Future improvements could include persistent message history, client usernames, and enhanced error handling. The key takeaway from this project is the implementation of a working chat room using only standard Java libraries without relying on any external frameworks. It teaches fundamental principles of client-server communication, threading for concurrent client handling, and basic socket I/O operations. Overall, this Java multithreaded chat system is a solid demonstration of low-level network programming and concurrency in action and is ideal for those interested in backend development, systems programming, or preparing for technical interviews that focus on Java fundamentals.


OutPut:










