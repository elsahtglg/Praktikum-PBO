class Titik
{
	double absis, ordinat;
	static double counterTitik;
	
	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	Titik(double a, double o)
	{
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	
	void setAbsis(double abs)
	{
		absis = abs;
	}

	void setOrdinat(double o)
	{
		ordinat = o;
	}

	void setAbsis1(double abs)
	{
		absis = abs;
	}
	
	void setOrdinat1(double o)
	{
		ordinat = o;
	}

	double getAbsis()
	{
		return absis;
	}

	double getOrdinat()
	{
		return ordinat;
	}

	double getAbsis1()
	{
		return absis;
	}
	
	double getOrdinat1()
	{
		return ordinat;
	}

	static double getCounterTitik()
	{
		return counterTitik;
	}

}