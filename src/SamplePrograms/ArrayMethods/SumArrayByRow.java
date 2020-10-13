package SamplePrograms.ArrayMethods;
public class SumArrayByRow{
public static void main(String[] args){
double shopping[][] = {
{3.49,12.50,14},
{20,30.50},
{34,12,50,101.34,23.99,54.17}
};



double tots[] = getTotals(shopping);


    System.out.println ("Totals for " + tots.length + "days: ");

for (int i = 0;
    i<tots.length;
    i++){
    System.out.format("tots[%d] = $%.2f\n", i, tots[i]);

    }
}

public static double[] getTotals(double prices[][]){
double totals[] = new double[prices.length];
//totlas need to have same as number of rows in prices
for (int i =0; i<prices.length;i++){
for (int j =0; j<prices[i].length;j++){

}
}
return totals;
}
}
