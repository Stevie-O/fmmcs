    class DCVoltageElm extends VoltageElm {
	public DCVoltageElm(int xx, int yy) { super(xx, yy, WF_DC); }
	Class<? extends CircuitElm> getDumpClass() { return VoltageElm.class; }
	int getShortcut() { return 'v'; }
    }
