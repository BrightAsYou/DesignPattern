package prs.rfh.dsnp.command;

import prs.rfh.dsnp.command.device.Light;
import prs.rfh.dsnp.command.device.Stereo;

public class TraditionControl implements Control {
	Light light;
	Stereo stereo;

	public TraditionControl(Light light, Stereo stereo) {
		this.light = light;
		this.stereo = stereo;
	}

	@Override
	public void onButton(int slot) {
		// TODO Auto-generated method stub
		switch (slot) {
		case 0:
			light.On();
			break;
		case 1:
			stereo.On();
			break;
		case 2:
			int vol = stereo.GetVol();
			if (vol < 11) {
				stereo.SetVol(++vol);
			}
			break;
		}
	}



	@Override
	public void undoButton() {
		// TODO Auto-generated method stub
		
	}

	

}
