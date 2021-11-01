package question;

public class Won2Dollar extends Converter {

	public Won2Dollar(double ratio) {
		this.ratio=ratio;
		
	}

	@Override
	protected double convert(double src) {
		double res = src/ratio;
		return res;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {		
		return "달러";
	}

}
