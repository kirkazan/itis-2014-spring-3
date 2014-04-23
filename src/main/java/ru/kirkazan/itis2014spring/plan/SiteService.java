package ru.kirkazan.itis2014spring.plan;

import java.util.List;

/**
 * @author esadykov
 * @since 23.04.14 17:56
 */
public interface SiteService {

    List<Profile> getProfiles();
    List<ServiceWithPrice> getService(Integer profileId);
    String createRequest(Request request);
}
