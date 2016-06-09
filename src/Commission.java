public class Commission extends Hourly
{
    private double totalSales;
    private double commRate;
    
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double comm)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        commRate = comm;
        totalSales = 0;
    }
    
    public void addHours(int moreHours)
    {
        hoursWorked += moreHours;
    }
    
    public void addSales(double sale)
    {
        totalSales += sale;
    }
    
    public double pay()
    {
        double payment = super.pay() + (totalSales * commRate);
        
        totalSales = 0;
        
        return payment;
    }
    
    public String toString()
    {
        String result = super.toString();
        
        result += "\nTotal Sales: " + totalSales;
        
        return result;
    }
}

