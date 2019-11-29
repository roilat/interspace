package cn.roilat.interspace.blog.base.lang;

/**
 * 
 * @author roilat-J
 *
 */
public class LinjiezhijiaBlogException extends RuntimeException {
	private static final long serialVersionUID = -7443213283905815106L;
	private int code;

	public LinjiezhijiaBlogException() {
	}

	/**
	 * LinjiezhijiaBlogException
	 * 
	 * @param code 错误代码
	 */
	public LinjiezhijiaBlogException(int code) {
		super("code=" + code);
		this.code = code;
	}

	/**
	 * LinjiezhijiaBlogException
	 * 
	 * @param message 错误消息
	 */
	public LinjiezhijiaBlogException(String message) {
		super(message);
	}

	/**
	 * LinjiezhijiaBlogException
	 * 
	 * @param cause 捕获的异常
	 */
	public LinjiezhijiaBlogException(Throwable cause) {
		super(cause);
	}

	/**
	 * LinjiezhijiaBlogException
	 * 
	 * @param message 错误消息
	 * @param cause   捕获的异常
	 */
	public LinjiezhijiaBlogException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * LinjiezhijiaBlogException
	 * 
	 * @param code    错误代码
	 * @param message 错误消息
	 */
	public LinjiezhijiaBlogException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
