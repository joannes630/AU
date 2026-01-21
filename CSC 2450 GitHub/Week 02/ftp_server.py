import socket

HOST = "0.0.0.0"   # Listen on all interfaces
PORT = 21         # FTP control port (privileged)

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((HOST, PORT))
server.listen(1)

print("Server listening on port 21...")

while True:
    conn, addr = server.accept()
    print("Connection from", addr)

    conn.sendall(b"220 Simple TCP server on port 21\r\n")
    conn.close()

