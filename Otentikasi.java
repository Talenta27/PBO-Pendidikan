public interface Otentikasi {

    static final boolean LOGGED_IN = true;
    static final boolean LOGGED_OUT = false;
    
    abstract boolean doLogin(String username, String password);
    abstract String setSession(boolean sessionUser);

}
