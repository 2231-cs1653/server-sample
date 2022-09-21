# Server Sample

## To run this sample code locally:

1. Compile everything

        $ javac *.java

2. Start the server

        $ java EchoServer

3. Open two new terminals

4. In each terminal, connect a client to the server

        $ java EchoClient localhost

5. Type messages. The server will echo the messages typed at the client, and
will indicate which client sent each message.

## To run this sample across the network:

1. Compile everything

        $ javac *.java

2. Start the server on one machine (e.g., ritchie):

        $ java EchoServer

3. On other machines, connect clients to the server (e.g., on both kernighan and
thompson; note that the cluster machines can be referred to by one another using
just their short names):

        $ java EchoClient ritchie

4. Type messages. The server will echo the messages typed at the client, and
will indicate which client sent each message.
