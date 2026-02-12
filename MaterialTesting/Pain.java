package MaterialTesting;

public class Pain {
    /**QUESTION 3*
An engineering firm is testing the durability of a new building material. They apply pressure in cycles until the material reaches its "Failure Point." Write a program in Java that performs the following tasks:

1. *Variables:*
• double structuralIntegrity = 100.0 (Starting health of the material).
• int cycleCount = 0.
• final double FAILURE_THRESHOLD = 15.0 (The material is considered broken if it drops to this level).

2. *The Loop:*
• Use a while loop that runs as long as structuralIntegrity is greater than FAILURE_THRESHOLD.

3. *The Logic:*
• Input: Each cycle, ask the user: "Enter pressure force for Cycle [n]: ".
• Damage: Subtract the pressure force from the structuralIntegrity.
• The "Stress": If the pressure force entered is greater than 20.0, an extra 5.0 units of "fatigue damage" is automatically subtracted from the integrity.
• Tracking: Increment the cycleCount for every loop.

4. *Output:*
• After each cycle, print the remaining integrity.
• Once the loop ends, print: "Material Failure at Cycle [cycleCount]!".
• Print the Final Integrity Level. */
}
