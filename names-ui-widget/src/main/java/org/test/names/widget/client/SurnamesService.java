package org.test.names.widget.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("surnames")
public interface SurnamesService extends RemoteService {
  ArrayList<String> getSurnames() throws IllegalArgumentException;
}
