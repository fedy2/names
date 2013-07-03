package org.test.namesui.server;

import java.util.ArrayList;

import javax.inject.Inject;

import org.test.names.backend.NameProvider;
import org.test.namesui.client.NamesService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class NamesServiceImpl extends RemoteServiceServlet implements NamesService {

	@Inject
	protected NameProvider provider;

	public ArrayList<String> getNames() throws IllegalArgumentException {

		ArrayList<String> names = new ArrayList<String>();
		if (provider == null) names.add("provider null");
		else names.addAll(provider.getNames());
		
		return names;
	}


}
