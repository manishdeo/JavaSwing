package com.wine.shop.property;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.wine.shop.gateway.WineConstants;

/**
 *  @author MANISH DEO
 */

public class WinePropertyReader implements WineConstants{
	
	private static final Logger LOGGER =Logger.getLogger(WinePropertyReader.class);
	private static Properties properties;
	private String propertyFile;

	/**
	 * 
	 * @param propertyFile
	 */
	public WinePropertyReader(String propertyFile) {
		this.propertyFile = propertyFile;
		initProperties();
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	/**
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public String getProperty(String key, String defaultValue) {
		return properties.getProperty(key, defaultValue);
	}

	/**
	 * 
	 */
	private void initProperties() {
		properties = new Properties();
		InputStream propFile = getClass().getResourceAsStream(propertyFile);
		if (propFile == null) {
			LOGGER.error("UNABLE_TO_FIND_PROPERTY_FILE"+ propertyFile);
		} else {
			try {
				properties.load(propFile);
			} catch (IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
			try {
				propFile.close();
			} catch (IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
	}

	/**
	 * 
	 */
	public void reLoad() {
		initProperties();
	}
}