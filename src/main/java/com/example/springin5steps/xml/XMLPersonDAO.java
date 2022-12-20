package com.example.springin5steps.xml;


public class XMLPersonDAO {

    XMLJdbcConnection jdbcConnection;

    public XMLJdbcConnection getXMLJdbcConnection() {
        return jdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
