import javax.naming.*;
import javax.jms.*;

Context jndiContext = new InitialContext();
QueueConnectionFactory queueConnectionFactory =(QueueConnectionFactory) jndiContext.lookup("MyConnectionFactory"); 
QueueConnection queueConnection = queueConnectionFactory.createQueueConnection();
QueueSession queueSession = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
Queue queue = (Queue) jndiContext.lookup("MyQueue");
QueueReceiver queueReceiver = queueSession.createReceiver(queue);
queueConnection.start();
Message message = (TextMessage) queueReceiver.receive();
String text = message.getTex;