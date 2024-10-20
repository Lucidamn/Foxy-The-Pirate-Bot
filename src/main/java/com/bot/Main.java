package com.bot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

import java.util.concurrent.ExecutionException;

public class Main {
    public static DiscordApi client;
    public static void main(String[] args) {
        try {
            client = new DiscordApiBuilder()
                    .setAllIntents()
                    .setToken(System.getenv("BOT_TOKEN"))
                    .login()
                    .get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Failed to log in to Discord API", e);
        }
    }
}