package tvguide.test.rest;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import tvguide.rest.BroadcastService;
import tvguide.rest.models.Broadcast;
import tvguide.service.SearchService;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(Arquillian.class)
public class BroadcastServiceTest {

    @Deployment
    public static WebArchive deployment() {
        return RESTDeployment.deployment();
    }

    @Inject
    private BroadcastService broadcastService;

    @Inject
    private SearchService searchService;

    @Test
    public void testGetBroadcastById() {
        Broadcast broadcast = broadcastService.getSingleInstance(new Long("1"));
        assertNotNull(broadcast);
        assertEquals(new Long("1381906800"), broadcast.getBeginTime());
    }

    @Test
    public void testCountNumberOfBroadcastsWithChannelId() {
        //TODO Fix test
        assertEquals(15, searchService.retrieveBroadcasts(new Long("123455"), new Long("123455"), new Long("1")).size());
    }

}

