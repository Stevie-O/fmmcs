    class NJfetElm extends JfetElm {
	public NJfetElm(int xx, int yy) { super(xx, yy, false); }
	Class<? extends CircuitElm> getDumpClass() { return JfetElm.class; }
    }

    class PJfetElm extends JfetElm {
	public PJfetElm(int xx, int yy) { super(xx, yy, true); }
	Class<? extends CircuitElm> getDumpClass() { return JfetElm.class; }
    }

