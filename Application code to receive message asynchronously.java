QueueReceiver queueReceiver = queueSession.createReceiver(queue);
TextListener textListener = new TextListener();
queueReceiver.setMessageListener(textListener);
queueConnection.start();