    class ACVoltageElm extends VoltageElm {
	public ACVoltageElm(int xx, int yy) { super(xx, yy, WF_AC); }
	Class<? extends CircuitElm> getDumpClass() { return VoltageElm.class; }
    }
