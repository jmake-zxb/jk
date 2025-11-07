package com.jk.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * 授权拒绝异常类
 *
 * @author 1661
 */
@NoArgsConstructor
public class PigDeniedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PigDeniedException(String message) {
		super(message);
	}

	public PigDeniedException(Throwable cause) {
		super(cause);
	}

	public PigDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public PigDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
