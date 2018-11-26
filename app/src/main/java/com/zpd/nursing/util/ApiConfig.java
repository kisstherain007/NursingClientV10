package com.zpd.nursing.util;

/**
 * Created by zhoubo on 2017/8/19.
 */

public class ApiConfig {

//	public static final String version_V9 = "9.1.1.2";
	public static final String version_V10 = "10.0.0.0";
//	public static String IP = "58.213.74.134";
//	public static int SERVER_PORT = 280;
//	public static String SERVER_IP = IP + ":" + SERVER_PORT;
//	public static String SERVER_URL = "http://" + SERVER_IP + "/zpdydhl_mobile/";
//	public static String REMOTE_APP_URL = "http://" + SERVER_IP + "/zpdydhl_html5/";

//	public static String IP = "192.168.2.111";
//	public static int SERVER_PORT = 9213;
//	public static String SERVER_IP = IP + ":" + SERVER_PORT;
//	public static String SERVER_URL = "http://" + SERVER_IP + "/9.2.3.4/";
//	public static String REMOTE_APP_URL = "http://" + SERVER_IP + "/zpdydhl_html5/";
//	public static String REMOTE_APT_URL = "http://" + IP + "/zpdydhl/";

	public static String IP = "192.168.2.130";
	public static int SERVER_PORT = 8093;
	public static String SERVER_IP = IP + ":" + SERVER_PORT;
	public static String SERVER_URL = "http://" + SERVER_IP + "/common/";
	public static String REMOTE_APP_URL = "http://" + SERVER_IP + "/zpdydhl_html5/";
	public static String REMOTE_APT_URL = "http://" + IP + "/zpdydhl/";

	public static int HTML5_PORT = 80;
	public static String SERVER_H5_URL = "http://" + IP + ":" +HTML5_PORT;

	public static final String version = "9.1.1.2";


	/** 开发版 10.0.X (开发版) ———内网*/
//	public static String IP = "192.168.2.111";
//	public static int SERVER_PORT = 8083;
//	public static String SERVER_IP = IP + ":" + SERVER_PORT;
//	public static String SERVER_URL = "http://" + SERVER_IP + "/10.0.0.0/";
//	public static String REMOTE_APP_URL = "http://" + SERVER_IP + "/zpdydhl_html5/";
//	public static String REMOTE_APT_URL = "http://" + IP + "/zpdydhl/";
//	public static String SERVER_H5_URL = "http://" + IP;
//	public static final String version = "10.0.0.0";


//	public static String IP = "192.168.103.206";
//	public static int SERVER_PORT = 8098;
//	public static String SERVER_IP = IP + ":" + SERVER_PORT;
//	public static String SERVER_URL = "http://" + SERVER_IP + "/9.0.1.1/";
//	public static String REMOTE_APP_URL = "http://" + SERVER_IP + "/zpdydhl_html5/";
//	public static String REMOTE_APT_URL = "http://" + IP + "/zpdydhl/";
//	public static String SERVER_H5_URL = "http://" + IP;

    public static final String Base_URL = SERVER_URL;
	public static final String Host_Url = "tcp://"+IP+":1883";	// Mqtt推送服务
}
