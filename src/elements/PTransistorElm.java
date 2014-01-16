    class PTransistorElm extends TransistorElm {
	public PTransistorElm(int xx, int yy) { super(xx, yy, true); }
	Class<? extends CircuitElm> getDumpClass() { return TransistorElm.class; }
    }
