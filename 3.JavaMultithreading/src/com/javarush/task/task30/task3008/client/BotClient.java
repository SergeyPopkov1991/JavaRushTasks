package com.javarush.task.task30.task3008.client;

public class BotClient extends Client {
    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    @Override
    protected String getUserName() {
        return  "date_bot_" + (int) (Math.random()*100);


    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected SocketThread getSocketThread() {
        BotSocketThread botSocketThread = new BotSocketThread();
        return botSocketThread;
    }

    public class BotSocketThread extends SocketThread {

    }
}
