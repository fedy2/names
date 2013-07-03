package org.test.names.widget.server;

import java.util.ArrayList;

import javax.inject.Inject;

import org.test.names.backend.NameProvider;
import org.test.names.widget.client.SurnamesService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class SurnamesServiceImpl extends RemoteServiceServlet implements SurnamesService {

	@Inject
	protected NameProvider provider;

	public ArrayList<String> getSurnames() throws IllegalArgumentException {

		ArrayList<String> surnames = new ArrayList<String>();
		if (provider == null) surnames.add("provider null");
		else surnames.addAll(provider.getSurnames());
		
		return surnames;
	}


}
