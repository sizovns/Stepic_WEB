package chat;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

/**
 * @author v.chibrikov
 * <p/>
 * Пример кода для курса на https://stepic.org/
 * <p/>
 * Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
@SuppressWarnings("UnusedDeclaration")
@WebSocket
public class ChatWebSocket {
    private Session session;

    @OnWebSocketConnect
    public void onOpen(Session session) {
        this.session = session;
    }

    @OnWebSocketClose
    public void onClose(int statusCode, String reason) {
        remove(this);
    }

    @OnWebSocketMessage
    public void onMessage(String data) {
        sendMessage(data);
    }

    private void remove(ChatWebSocket webSocket) {
        remove(webSocket);
    }

    private void sendMessage(String data) {
        try {
            sendString(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void sendString(String data) {
        try {
            session.getRemote().sendString(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
