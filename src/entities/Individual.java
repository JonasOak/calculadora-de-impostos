package entities;

public final class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpendituree(Double gastosSaude) {
		this.healthExpenditures = gastosSaude;
	}

	@Override
	public Double tax() {
		if (getHealthExpenditures() > 0.0) {
			if (getAnualIncome() < 20000.0) {
				return (getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);
			}
			else {
				return (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
			}
		}
		else {
			if (getAnualIncome() < 20000.0) {
				return (getAnualIncome() * 0.15);
			}
			else {
				return (getAnualIncome() * 0.25);
			}
		}
	}
	
}
