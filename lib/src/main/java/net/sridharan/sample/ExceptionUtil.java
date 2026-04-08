package net.sridharan.sample;

import org.jspecify.annotations.Nullable;

public class ExceptionUtil {

    static class BusinessException extends Exception {
        public BusinessException(String message) {
            super(message);
        }
    }

    static class BusinessExceptionUnauthenticated extends BusinessException {
        public BusinessExceptionUnauthenticated(String message) {
            super(message);
        }
    }


    private static @Nullable String test(Throwable t) {
        if (!(t instanceof RuntimeException rte) || !(rte.getCause() instanceof BusinessException bException)) {
            return "";
        }
        return null;
//        return switch (bException) {
//            case BusinessExceptionUnauthenticated e -> "";
//            default -> bException.getMessage();
//        };
    }
}