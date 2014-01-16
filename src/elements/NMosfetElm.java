    class NMosfetElm extends MosfetElm {
	public NMosfetElm(int xx, int yy) { super(xx, yy, false); }
	Class<? extends CircuitElm> getDumpClass() { return MosfetElm.class; }
    }
