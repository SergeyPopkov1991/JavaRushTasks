package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Сообщение не отправлено");
            }

        }
    }

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введите порт сервера");
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Произошла ошибка при запуске сервера");
        }


    }


    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {
            super.run();
        }


        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            connection.send(new Message(MessageType.NAME_REQUEST, "Пожалуйста введите ваше имя."));
            Message message = connection.receive();
            String name = message.getData();
            if (message.getType().equals(MessageType.USER_NAME)
                    && Objects.nonNull(name)
                    && !name.isEmpty()
                    && !connectionMap.containsKey(name)) {
                connectionMap.put(name, connection);
                connection.send(new Message(MessageType.NAME_ACCEPTED, "Имя было принято"));
                return name;

            } else {
                ConsoleHelper.writeMessage("Введите запрос сноваю");
                return serverHandshake(connection);
            }

        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String name : connectionMap.keySet()) {
               if (!name.equals(userName)) {
                   connection.send(new Message(MessageType.USER_ADDED , name));
               }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType()==(MessageType.TEXT)) {
                    sendBroadcastMessage(new Message(MessageType.TEXT , userName+ ": " + message.getData()));
                } else {
                    ConsoleHelper.writeMessage("Ошибка");
                }
            }
        }

    }
}
