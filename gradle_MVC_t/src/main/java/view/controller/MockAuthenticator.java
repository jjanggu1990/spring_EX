package view.controller;

public class MockAuthenticator implements Authenticator {

	public void authenticate(String id, String password) {
		if (!id.equals("test")) {
			throw new AuthenticationException("invalid id "+id);
		}
	}

}
