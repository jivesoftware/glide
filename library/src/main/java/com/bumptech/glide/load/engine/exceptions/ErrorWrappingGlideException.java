package com.bumptech.glide.load.engine.exceptions;

/**
 * An exception class used for wrapping and distinguishing errors such as
 * {@link OutOfMemoryError}.
 */
public class ErrorWrappingGlideException extends Exception {
    public ErrorWrappingGlideException(Throwable throwable) {
        super(throwable);
    }
}
