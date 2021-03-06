package com.vmware.ddlog.ir;

public class DDlogEFor extends DDlogExpression {
    private final String loopIter;
    private final DDlogExpression iter;
    private final DDlogExpression body;

    public DDlogEFor(String loopIter, DDlogExpression iter, DDlogExpression body) {
        super(body.getType());
        this.loopIter = loopIter;
        this.iter = iter;
        this.body = body;
    }

    @Override
    public String toString() {
        return "for (" + this.loopIter + " in " + this.iter.toString() + ") {\n" +
                this.body.toString() + "}\n";
    }
}
