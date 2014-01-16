    class OpAmpSwapElm extends OpAmpElm {
	public OpAmpSwapElm(int xx, int yy) {
	    super(xx, yy);
	    flags |= FLAG_SWAP;
	}
	Class<? extends CircuitElm> getDumpClass() { return OpAmpElm.class; }
    }
