package app;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */
public enum PropertyKeys {
    USER_NAME("username"),
    URL("url"),
    PASSWORD("password"),
    CA("ca"),
    CLIENT_ANALYTICS("client_analytics");
    // all keys here

    private  String key;

    PropertyKeys(String key) {
      this.key = key;
    }

    public String getKey(){
        return key.toLowerCase();
    }
}
