package com.wine.shop;

import org.apache.log4j.Logger;

import com.wine.shop.gateway.WineConstants;
import com.wine.shop.gui.WineFrame;
import com.wine.shop.property.WinePropertyReader;


/**
 * @author Manish Deo
 */

public class WineLaunch implements WineConstants {

	private static final Logger LOGGER = Logger.getLogger(WineLaunch.class);
	
	private WinePropertyReader configProperties;
	private WinePropertyReader properties;
	private static WineLaunch instance;

	/**
	 * 
	 * @return
	 */
	public static WineLaunch getInstance() {

		if (instance == null) {
			instance = new WineLaunch();
		}

		return instance;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		WineLaunch launch = WineLaunch.getInstance();
		launch.start(args);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public String getProperty(final String key) {
		properties = new WinePropertyReader(_WINE_BUNDLE);
		return properties.getProperty(key, "");
	}


	/**
	 * 
	 * @param key
	 * @return
	 */
	public String getConfigProperty(final String key) {
		configProperties = new WinePropertyReader(_WINE_CONFIG);
		return configProperties.getProperty(key, _EMPTY_TAG);
	}
	
	/**
	 * 
	 * @param args
	 */
	public void start(final String[] args) {

		final WineFrame frame = new WineFrame();
		frame.guiRender();
		
		  java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                 frame.setVisible(true);
	            }
	        });
		  
			LOGGER.info(WineConstants._LAUNCH_APPLICATION);			
	}
}
	
