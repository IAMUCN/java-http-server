package com.ucn.httpserver.config;

public class ConfigurationManager
{   // this is a singleton class i.e. it will only have one instance
    private static ConfigurationManager myConfigurationManager;
    private static Configuration myCurrentConfiguration;
    private ConfigurationManager()
    {
    }

    public static ConfigurationManager getInstance()
    {
        if (myConfigurationManager == null)
            myConfigurationManager = new ConfigurationManager();
        return myConfigurationManager;
    }

    /**
     * used to load a configuration file by the path provided
     */
    public void loadConfigurationFile(String filePath)
    {
        // implementation to be written
    }

    /*
    * returns the current loaded Configuration
     */
    public void getCurrentConfiguration()
    {

    }
}
