package za.co.aneleal.server.service;

import za.co.aneleal.server.model.Server;

import java.io.IOException;
import java.util.Collection;

/**
 * @author Anele Aneal Tose
 * @version 1.0
 * @since 15/11/2023
 */
public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
