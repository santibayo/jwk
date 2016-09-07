package tcpip.crypto.jwk.parsers;

public class JwtParserException extends Exception {
	private int code;

	public JwtParserException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JwtParserException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public JwtParserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public JwtParserException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	
}
