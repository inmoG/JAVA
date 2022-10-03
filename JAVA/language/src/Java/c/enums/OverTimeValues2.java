package Java.c.enums;

import c.model.MemberDTO;

public enum OverTimeValues2 {
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);

    private final int amount;

    // protected OverTimeValues2(int amount) {
    // this.amount = amount;
    // }

    OverTimeValues2(int amount) {
        this.amount = amount;
    }

    // Enum example = new OverTimeValues2();
    MemberDTO dto = new MemberDTO();

    public int getAmount() {
        return amount;
    }
}
