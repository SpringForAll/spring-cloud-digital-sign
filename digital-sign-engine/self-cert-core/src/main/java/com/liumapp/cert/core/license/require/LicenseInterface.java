package com.liumapp.cert.core.license.require;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author liumapp
 * @file LicenseInterface.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/26/18
 */
public interface LicenseInterface {

    public JSONArray configCa(JSONArray trustCA) throws JSONException;

    public JSONObject configKs(JSONObject ks) throws JSONException;

    public String configLicense() ;

}
