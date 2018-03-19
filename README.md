# Android-Chat-Application
This is a Simple Chat Application which enables android mobiles to chat with each another without Internet Connection.

This application consists of two main sub applications.

    1.IP-Connection
    2.TCPIP_Client

## IP-Connection 

This is the Server application which makes one device a TCP/IP Server. Currently it is using the port 8080 and DHCP IP address when it is running.

This application is a simple prototype of **Proxy Gateway**. Every client have to communicate across the server. Clients' MAC addresses and IP address are recorded.

_Note :_
_Start this Application before connect to the internet for the full functioanlities._

##  TCPIP_Client

This is the Clicent Application. Every device wish to communicate with server should have to be installed this application. Currently the client is initiated as "Gimo" [_Me_] and the port is 8080 as same as Server. 

Users are encouraged to use the predefined ports for error free communication and developers may use their own design decisions. 

## Usage

    1.Install and run IP-Connection on one device and make sure not to connect the internet prior the execution of the application.

    2.Install and run the TCPIP_client on devices which suppose to communicate with server.

    When connection is successful "Welcome to TCP/IP-Server Server" message will display on the IP-Connection application.

