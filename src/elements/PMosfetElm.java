    class PMosfetElm extends MosfetElm {
	public PMosfetElm(int xx, int yy) { super(xx, yy, true); }
	Class<? extends CircuitElm> getDumpClass() { return MosfetElm.class; }
    }
