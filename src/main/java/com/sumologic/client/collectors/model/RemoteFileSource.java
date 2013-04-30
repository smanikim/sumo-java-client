package com.sumologic.client.collectors.model;

/**
 * A source that reads from remote files over SSH matching a path expression.
 *
 * @author Jeffrey Wang
 */
public class RemoteFileSource extends BaseFileSource {

    private static String REMOTE_HOST = "remoteHost";
    private static String REMOTE_PORT = "remotePort";
    private static String REMOTE_USER = "remoteUser";
    private static String REMOTE_PASSWORD = "remotePassword";
    private static String KEY_PATH = "keyPath";
    private static String KEY_PASSWORD = "keyPassword";
    private static String AUTH_METHOD = "authMethod";

    public RemoteFileSource() {
        setSourceType(SourceType.REMOTE_FILE.getType());
    }

    /**
     * Returns the remote host.
     *
     * @return The remote host.
     */
    public String getRemoteHost() {
        return getProperty(REMOTE_HOST);
    }

    /**
     * Sets the remote host.
     */
    public void setRemoteHost(String remoteHost) {
        setProperty(REMOTE_HOST, remoteHost);
    }

    /**
     * Returns the remote port.
     *
     * @return The remote port.
     */
    public Integer getRemotePort() {
        return getProperty(REMOTE_PORT);
    }

    /**
     * Sets the remote port.
     */
    public void setRemotePort(Integer remotePort) {
        setProperty(REMOTE_PORT, remotePort);
    }

    /**
     * Returns the remote user.
     *
     * @return The remote user.
     */
    public String getRemoteUser() {
        return getProperty(REMOTE_USER);
    }

    /**
     * Sets the remote user.
     */
    public void setRemoteUser(String remoteUser) {
        setProperty(REMOTE_USER, remoteUser);
    }

    /**
     * Returns the remote password (hidden in server response).
     *
     * @return The remote password.
     */
    public String getRemotePassword() {
        return getProperty(REMOTE_PASSWORD);
    }

    /**
     * Sets the remote password.
     */
    public void setRemotePassword(String remotePassword) {
        setProperty(REMOTE_PASSWORD, remotePassword);
    }

    /**
     * Returns the remote path.
     *
     * @return The remote path.
     */
    public String getKeyPath() {
        return getProperty(KEY_PATH);
    }

    /**
     * Sets the key path.
     */
    public void setKeyPath(String keyPath) {
        setProperty(KEY_PATH, keyPath);
    }

    /**
     * Returns the key password (hidden in server response).
     *
     * @return The key password.
     */
    public String getKeyPassword() {
        return getProperty(KEY_PASSWORD);
    }

    /**
     * Sets the key password.
     */
    public void setKeyPassword(String keyPassword) {
        setProperty(KEY_PASSWORD, keyPassword);
    }

    /**
     * Returns the auth method.
     *
     * @return The auth method.
     */
    public String getAuthMethod() {
        return getProperty(AUTH_METHOD);
    }

    /**
     * Sets the auth method.
     */
    public void setAuthMethod(String authMethod) {
        setProperty(AUTH_METHOD, authMethod);
    }
}
