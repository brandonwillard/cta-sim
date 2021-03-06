package dssg.client;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service. Communicates client side with
 * server side for simulation submission, running simulation and
 */
@RemoteServiceRelativePath("simulate")
public interface SimulationService extends RemoteService {
  // Submits simulation to be executed
  String submitSimulation(Set<String> routeAndDirs, Date startTime, Date endTime)
      throws IllegalArgumentException;

  // Starts simulation and returns the results when done
  public Map<String, Integer[]> runSimulation(String route, String direction,
      Date date, Integer startTime, Integer endTime);

  // Starts simulation and returns the results when done
  public String estimateParameters(String route);

}
