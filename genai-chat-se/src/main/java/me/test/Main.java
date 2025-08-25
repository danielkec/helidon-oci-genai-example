
package me.test;

import io.helidon.config.Config;
import io.helidon.logging.common.LogConfig;
import io.helidon.service.registry.Services;
import io.helidon.webserver.WebServer;

public class Main {
    public static void main(String[] args) {

        // load logging configuration
        LogConfig.configureRuntime();

        // initialize global config from default configuration
        Config config = Config.create();
        Config.global(config);

        WebServer server = WebServer.builder()
                .config(config.get("server"))
                .routing(r -> r.post("/chat", (req, res) -> {
                    var prompt = req.content().as(String.class);
                    var response = Services.get(DiscoveryChatService.class).chat(prompt);
                    res.send(response);
                }))
                .build()
                .start();

        System.out.println("WEB server is up! http://localhost:" + server.port() + "/simple-greet");
    }
}