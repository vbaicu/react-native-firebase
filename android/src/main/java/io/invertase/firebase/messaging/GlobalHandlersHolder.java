package io.invertase.firebase.messaging;

public class GlobalHandlersHolder {
    private static final GlobalHandlersHolder ourInstance = new GlobalHandlersHolder();

    public IRNNotifDisplayHandler getDisplayHandler() {
        return displayHandler;
    }

    public void setDisplayHandler(IRNNotifDisplayHandler displayHandler) {
        this.displayHandler = displayHandler;
    }

    private IRNNotifDisplayHandler displayHandler;

    public static GlobalHandlersHolder getInstance() {
        return ourInstance;
    }

    private GlobalHandlersHolder() {
    }


}
