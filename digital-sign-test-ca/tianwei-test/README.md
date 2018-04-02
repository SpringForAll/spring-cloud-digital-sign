# tianwei-test

## how to use 

* modify application.yml to config your project

* write your own Rest-API.

* the certificate password equals the keystore password . 

* The alias of the certificate is saved on the basis of the serial number of the certificate to 16.
  
### cert alias : 
    
    PublicKey pubKey = cert.getPubKey();
    byte[] binPubKey = pubKey.getEncoded();
    String alias = Hex.encodeHexString(in); 