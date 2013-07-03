package org.test.namesui.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("names")
public interface NamesService extends RemoteService {
	ArrayList<String> getNames() throws IllegalArgumentException;
}
