class TextListener implements MessageListener
{
	public void onMessage(Message message)
	{
		TextMessage message = (TextMessage) message;
		String text = message.getText();
	}
}