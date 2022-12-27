import javax.naming.*;
import javax.jms.*;

Context jndiContext = new InitialContext();

QueueConnectionFactory queueConnectionFactory = (QueueConnectionFactory) jndiContext.lookup("MyConnectionFactory");

QueueConnection queueConnection = queueConnectionFactory.createQueueConnection();

QueueSession queueSession = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

Queue queue = (Queue) jndiContext.lookup("MyQueue");

QueueSender queueSender = queueSession.createSender(queue);

Message message = queueSession.createTextMessage();

message.setText("This is a text message.");

queueSender.send(message);
