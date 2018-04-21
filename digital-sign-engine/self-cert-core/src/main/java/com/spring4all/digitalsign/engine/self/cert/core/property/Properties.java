package com.spring4all.digitalsign.engine.self.cert.core.property;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liumapp
 * @file Properties.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/3/18
 */
public class Properties implements Serializable {

    private static final long serialVersionUID = 1723327234615067236L;

    private final Map<String, String> dataMap = new LinkedHashMap<String, String>();

    private String content;

    public Properties(String path) throws IOException {
        this(new Content(path).getContent() , "UTF-8");
    }

    public Properties(String content, String encoding) throws IOException {
        this.content = content;

        InputStream inputStream = null;
        Reader reader = null;
        try {
            inputStream = IOUtils.toInputStream(content, encoding);
            reader = new InputStreamReader(inputStream, encoding);

            java.util.Properties properties = new java.util.Properties();
            properties.load(reader);
            for (Iterator<Object> iterator = properties.keySet().iterator(); iterator.hasNext();) {
                String key = iterator.next().toString();
                String value = properties.getProperty(key);
                put(key, value);
            }
        } finally {
            if (reader != null) {
                IOUtils.closeQuietly(reader);
            }

            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
        }
    }

    public void put(String key, String value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null for key [" + key + "]");
        }

        dataMap.put(key, value);
    }

    public String getString(String key) {
        if (!dataMap.containsKey(key)) {
            throw new IllegalArgumentException("Key [" + key + "] isn't found in properties");
        }

        return dataMap.get(key);
    }

    public String getString(String key, String defaultValue) {
        String value = getString(key);
        if (value != null) {
            return value;
        } else {
            return defaultValue;
        }
    }

    public boolean getBoolean(String key) {
        String value = getString(key);
        if (value != null) {
            try {
                return Boolean.parseBoolean(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to boolean", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return Boolean.parseBoolean(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to boolean", e);
            }
        } else {
            return defaultValue;
        }
    }

    public int getInteger(String key) {
        String value = getString(key);
        if (value != null) {
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to int", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public int getInteger(String key, int defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to int", e);
            }
        } else {
            return defaultValue;
        }
    }

    public long getLong(String key) {
        String value = getString(key);
        if (value != null) {
            try {
                return Long.parseLong(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to long", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public long getLong(String key, long defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return Long.parseLong(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to long", e);
            }
        } else {
            return defaultValue;
        }
    }

    public short getShort(String key, short defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return Short.parseShort(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to short", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public Short getShort(String key, Short defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return Short.parseShort(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to short", e);
            }
        } else {
            return defaultValue;
        }
    }

    public byte getByte(String key) {
        String value = getString(key);
        if (value != null) {
            try {
                return Byte.parseByte(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to byte", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public byte getByte(String key, byte defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return Byte.parseByte(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to byte", e);
            }
        } else {
            return defaultValue;
        }
    }

    public double getDouble(String key) {
        String value = getString(key);
        if (value != null) {
            try {
                return Double.parseDouble(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to double", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public double getDouble(String key, double defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return Double.parseDouble(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to double", e);
            }
        } else {
            return defaultValue;
        }
    }

    public float getFloat(String key) {
        String value = getString(key);
        if (value != null) {
            try {
                return Float.parseFloat(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to float", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public float getFloat(String key, float defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return Float.parseFloat(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to float", e);
            }
        } else {
            return defaultValue;
        }
    }

    public BigInteger getBigInteger(String key) {
        String value = getString(key);
        if (value != null) {
            try {
                return BigInteger.valueOf(Long.parseLong(value));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to BigInteger", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public BigInteger getBigInteger(String key, BigInteger defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return BigInteger.valueOf(Long.parseLong(value));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to BigInteger", e);
            }
        } else {
            return defaultValue;
        }
    }

    public BigDecimal getBigDecimal(String key) {
        String value = getString(key);
        if (value != null) {
            try {
                return BigDecimal.valueOf(Double.parseDouble(value));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to BigDecimal", e);
            }
        } else {
            throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] is null");
        }
    }

    public BigDecimal getBigDecimal(String key, BigDecimal defaultValue) {
        String value = getString(key);
        if (value != null) {
            try {
                return BigDecimal.valueOf(Double.parseDouble(value));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Value [" + value + "] for key [" + key + "] can't be parsed to BigDecimal", e);
            }
        } else {
            return defaultValue;
        }
    }

    public Map<String, String> getDataMap() {
        return dataMap;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "dataMap=" + dataMap +
                '}';
    }
}
