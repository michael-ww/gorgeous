package gorgeous.pattern.behavioral.responsibilitychain;

public abstract class MessageHandler {
    private MessageHandler nextMessageHandler;

    public final Response handle(Request request) {
        Response response = null;
        //
        this.nextMessageHandler.handle(request);
        return response;
    }
}
