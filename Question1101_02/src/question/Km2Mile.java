package question;

public class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio=ratio;
		
	}

	@Override
	protected double convert(double src) {
		double res = src/ratio;
		return res;
	}

	@Override
	protected String getSrcString() {
		
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "Mile";
	}

}
