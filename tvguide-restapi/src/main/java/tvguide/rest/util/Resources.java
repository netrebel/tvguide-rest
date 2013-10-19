package tvguide.rest.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * This class uses CDI to alias Java EE resources, such as the persistence context, to CDI beans
 * <p/>
 * <p>
 * Example injection on a managed bean field:
 * </p>
 * <p/>
 * <pre>
 * &#064;Inject
 * private EntityManager em;
 * </pre>
 */
public class Resources {

    /**
     * Alias the persistence context
     */
    // use @SuppressWarnings to tell IDE to ignore warnings about field not being referenced directly
    @SuppressWarnings("unused")
    @Produces
    @PersistenceContext
    private EntityManager em;

}
