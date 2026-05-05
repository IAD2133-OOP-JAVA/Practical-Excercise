package Irfan.EX_3;

public class FinancialLogic {

    public static void main(String[] args) {

        double MoIncome             = 4200.00; // RM
        double MoInvestPCT          = 0.15;   // 15%
        double SocResCon            = 0.03;   // 3%

        double yrIncome             = MoIncome * 12;
        double MoInvest             = MoIncome * MoInvestPCT;
        double yrInvest             = MoInvest * 12;
        double SRCYrInc             = yrIncome * SocResCon;
        double SRCYrInv             = yrInvest * SocResCon;

        System.out.println("Monthly Income: RM " + String.format("%.2f", MoIncome) + System.lineSeparator());
        System.out.println("Yearly Income: RM " + String.format("%.2f", yrIncome) + System.lineSeparator());
        System.out.println("Monthly Investment: RM " + String.format("%.2f", MoInvest) + System.lineSeparator());
        System.out.println("Yearly Investment: RM " + String.format("%.2f", yrInvest) + System.lineSeparator());
        System.out.println("Social Responsibility Contribution from Yearly Income: RM " + String.format("%.2f", SRCYrInc) + System.lineSeparator());
        System.out.println("Social Responsibility Contribution from Yearly Investment: RM " + String.format("%.2f", SRCYrInv) + System.lineSeparator());
    }
}
