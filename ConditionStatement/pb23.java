package ConditionStatement;
import java.util.Scanner;

public class pb23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stockPercentage = sc.nextInt();
        int investmentHorizon = sc.nextInt();
        sc.nextLine();
        String riskTolerance = sc.nextLine();
        String marketVolatility = sc.nextLine();

        int bondPercentage = 100 - stockPercentage;

        int riskScore = stockPercentage;

        if (investmentHorizon <= 5) {
            if (stockPercentage > 50) {
                riskScore += 20;
            }
        } 
        else if (investmentHorizon <= 10) {
            if (stockPercentage > 60) {
                riskScore += 10;
            }
        } 
        else if (investmentHorizon <= 20) {
            if (stockPercentage > 80) {
                riskScore += 5;
            }
        }

        if (marketVolatility.equals("Low")) {
            riskScore += 0;
        } 
        else if (marketVolatility.equals("Medium")) {
            riskScore += 10;
        } 
        else if (marketVolatility.equals("High")) {
            riskScore += 20;
        }

        if (riskScore > 100) {
            riskScore = 100;
        }

        String riskCategory = "";

        if (riskScore <= 30) {
            riskCategory = "Low";
        } 
        else if (riskScore <= 60) {
            riskCategory = "Moderate";
        } 
        else if (riskScore <= 80) {
            riskCategory = "High";
        } 
        else {
            riskCategory = "Very High";
        }

        String alignmentStatus = "";
        String recommendation = "";
        String rebalance = "";

        if (riskTolerance.equals("Conservative")) {

            if (riskCategory.equals("Low")) {
                alignmentStatus = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                rebalance = "No action needed";
            } 
            else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio is slightly above conservative risk level";
                rebalance = "Consider reducing stock exposure slightly";
            } 
            else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalance = "Reduce stocks to 30-40%, increase bonds and cash";
            }

        } 
        else if (riskTolerance.equals("Moderate")) {

            if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                rebalance = "No action needed";
            } 
            else if (riskCategory.equals("Low") || riskCategory.equals("High")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio risk slightly differs from target";
                rebalance = "Consider minor adjustments if needed";
            } 
            else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalance = "Reduce high-risk assets";
            }

        } 
        else if (riskTolerance.equals("Aggressive")) {

            if (riskCategory.equals("High") || riskCategory.equals("Very High")) {
                if (riskCategory.equals("Very High") && investmentHorizon >= 15) {
                    alignmentStatus = "Acceptable";
                    recommendation = "High risk level acceptable given long horizon and tolerance";
                    rebalance = "Monitor closely, consider slight reduction if volatility persists";
                } 
                else {
                    alignmentStatus = "Well Aligned";
                    recommendation = "Portfolio is appropriately balanced for your profile";
                    rebalance = "No action needed";
                }
            } 
            else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio could take more risk for higher growth";
                rebalance = "Consider increasing stock allocation";
            } 
            else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio is too conservative for your risk tolerance";
                rebalance = "Increase stocks to 80-90% for better growth potential";
            }
        }

        System.out.println("Stock Allocation: " + stockPercentage + "%");
        System.out.println("Bond Allocation: " + bondPercentage + "%");
        System.out.println("Investment Horizon: " + investmentHorizon + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + marketVolatility);
        System.out.println("Portfolio Risk Score: " + riskScore + "/100");
        System.out.println("Risk Category: " + riskCategory);
        System.out.println("Alignment Status: " + alignmentStatus);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + rebalance);
    }
}
