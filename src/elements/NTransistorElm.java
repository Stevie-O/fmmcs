    class NTransistorElm extends TransistorElm {
	public NTransistorElm(int xx, int yy) { super(xx, yy, false); }
	Class<? extends CircuitElm> getDumpClass() { return TransistorElm.class; }
    }
