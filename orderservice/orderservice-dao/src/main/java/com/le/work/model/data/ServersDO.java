package com.le.work.model.data;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table servers
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ServersDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Server_name
     *
     * @mbg.generated
     */
    private String serverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Port
     *
     * @mbg.generated
     */
    private Integer port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Socket
     *
     * @mbg.generated
     */
    private String socket;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Wrapper
     *
     * @mbg.generated
     */
    private String wrapper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column servers.Owner
     *
     * @mbg.generated
     */
    private String owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table servers
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Server_name
     *
     * @return the value of servers.Server_name
     *
     * @mbg.generated
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Server_name
     *
     * @param serverName the value for servers.Server_name
     *
     * @mbg.generated
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Host
     *
     * @return the value of servers.Host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Host
     *
     * @param host the value for servers.Host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Db
     *
     * @return the value of servers.Db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Db
     *
     * @param db the value for servers.Db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Username
     *
     * @return the value of servers.Username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Username
     *
     * @param username the value for servers.Username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Password
     *
     * @return the value of servers.Password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Password
     *
     * @param password the value for servers.Password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Port
     *
     * @return the value of servers.Port
     *
     * @mbg.generated
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Port
     *
     * @param port the value for servers.Port
     *
     * @mbg.generated
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Socket
     *
     * @return the value of servers.Socket
     *
     * @mbg.generated
     */
    public String getSocket() {
        return socket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Socket
     *
     * @param socket the value for servers.Socket
     *
     * @mbg.generated
     */
    public void setSocket(String socket) {
        this.socket = socket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Wrapper
     *
     * @return the value of servers.Wrapper
     *
     * @mbg.generated
     */
    public String getWrapper() {
        return wrapper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Wrapper
     *
     * @param wrapper the value for servers.Wrapper
     *
     * @mbg.generated
     */
    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column servers.Owner
     *
     * @return the value of servers.Owner
     *
     * @mbg.generated
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column servers.Owner
     *
     * @param owner the value for servers.Owner
     *
     * @mbg.generated
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servers
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serverName=").append(serverName);
        sb.append(", host=").append(host);
        sb.append(", db=").append(db);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", port=").append(port);
        sb.append(", socket=").append(socket);
        sb.append(", wrapper=").append(wrapper);
        sb.append(", owner=").append(owner);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}