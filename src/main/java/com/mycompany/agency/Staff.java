package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 employees to the staffList

        staffList[0] = new Executive("John Green", "40 Brooks Ave", "829-842-2788", "153-654-7427", 4095.50);
        staffList[1] = new StaffEmployee("Hanna Kane", "34 Woodland St", "213-862-9888", "321-553-8884", 3255.00);
        staffList[2] = new Intern("William Miller", "246 2nd St", "678-233-1241");
        staffList[3] = new TempEmployee("Natalia Sterling", "6 Maple St", "678-142-2478", "725-534-7658", 35.00);
        staffList[4] = new StaffEmployee("Jason Cruz", "21 Meadow Ave", "829-975-0134", "323-986-6546", 3145.50 );
        staffList[5] = new StaffEmployee ("Edward Baez", "171 Willow St", "213-342-0303", "388-542-7123", 3000.00 );

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmployee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
