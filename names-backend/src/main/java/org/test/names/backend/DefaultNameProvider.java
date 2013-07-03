/**
 * 
 */
package org.test.names.backend;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.inject.Default;

/**
 * @author "Federico De Faveri federico.defaveri@fao.org"
 *
 */
@Default
public class DefaultNameProvider implements NameProvider {

	public List<String> getNames() {
		return Arrays.asList("George","John","Thomas");
	}

	@Override
	public List<String> getSurnames() {
		return Arrays.asList("Washington","Adams","Jefferson");
	}

}
