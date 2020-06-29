package pl.javaadvanced.patterns.behavioral.chainOfResponsibility;

public abstract class AccessCheck {
    private AccessCheck nextCheck;

    public AccessCheck addChainElement(AccessCheck nextCheck) {
        this.nextCheck = nextCheck;
        return nextCheck;
    }

    public abstract boolean doCheck(String username);

    protected boolean checkNextElement(String username) {
        if(nextCheck == null)
            return true;
        return nextCheck.doCheck(username);
    }
}
