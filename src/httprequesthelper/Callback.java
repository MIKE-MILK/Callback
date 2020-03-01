package httprequesthelper;

public interface Callback {
    void onResponse(String response);
    void onFailed(Throwable t);
}
