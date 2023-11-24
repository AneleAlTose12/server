package za.co.aneleal.server.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import za.co.aneleal.server.model.Server;

/**
 * @author Anele Aneal Tose
 * @version 1.0
 * @since 15/11/2023
 */
public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
