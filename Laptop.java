package asd.one;

public class Laptop extends ComputerBuilder
{

		@Override
		public void bulidCPU() {
			// TODO Auto-generated method stub
			computer.setCPU("Intel(R) Core(TM) i5-9300H CPU @ 2.40GHz   2.40 GHz");
		}

		@Override
		public void bulidRAM() {
			// TODO Auto-generated method stub
			computer.setRAM("16GB");
		}

		@Override
		public void bulidharddisk() {
			// TODO Auto-generated method stub
			computer.setHarddisk("WDC WD10SPZX-22Z10T1");
		}

		@Override
		public void bulidmainframe() {
			// TODO Auto-generated
			computer.setMainframe("LAPTOP-I96CM1U8");
			}

		@Override
		public void bulidmonitor() {
			// TODO Auto-generated method stub
			computer.setMonitor("Intel(R) UHD Graphics 630" );
		}
		
	}
}
