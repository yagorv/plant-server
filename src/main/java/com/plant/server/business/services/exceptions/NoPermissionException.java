package com.plant.server.business.services.exceptions;

public class NoPermissionException extends ApiRuntimeException {

	private static final long serialVersionUID = -2162307696345634191L;
	
	public NoPermissionException(Object key, String className) {
        super("No permission " + key + " for " + className);
    }
	public NoPermissionException(String reason) {
        super(reason);
    }
    public NoPermissionException() {
        super();
    }
    public NoPermissionException(Throwable t) {
        super(t);
    }
}

