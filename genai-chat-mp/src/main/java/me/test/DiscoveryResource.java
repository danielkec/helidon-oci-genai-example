
package me.test;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/")
public class DiscoveryResource {

    private final DiscoveryChatService discoveryChatService;

    @Inject
    public DiscoveryResource(DiscoveryChatService discoveryChatService) {
        this.discoveryChatService = discoveryChatService;
    }

    @POST
    @Path("/chat")
    public Response chat(String prompt) {
        return Response.ok(discoveryChatService.chat(prompt)).build();
    }
}
