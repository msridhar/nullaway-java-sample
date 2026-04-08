package net.sridharan.sample;

class Foo {
private static String test(Throwable t) {
    if (!(t.getCause() instanceof RuntimeException rte)) {
        return "";
    }
        
    return switch (rte) {
        case NullPointerException npe -> npe.toString();
        default -> "";
    };    
}
}