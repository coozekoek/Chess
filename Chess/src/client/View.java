package client;

public interface View {

	/**
	 * 
	 * @param msg
	 */
	void infoMessage(String msg);

	/**
	 * 
	 * @param msg
	 */
	void errorMessage(String msg);

	/**
	 * 
	 * @param msg
	 */
	void chatMessage(String msg);

}