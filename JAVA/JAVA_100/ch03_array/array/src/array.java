public class array {
    public static void main(String[] args) {
        String[][] users = {
                { "egoing", "1111" },
                { "jinhuck", "2222" },
                { "youbin", "3333" }
        }; // 2차원 배열

        String inputId = "egoing";
        String inputPass = "1111";

        boolean isLogined = false;
        for (int i = 0; i < users.length; i++) {
            String[] current = users[i];

            if (current[0].equals(inputId) && current[1].equals(inputPass)) {
                isLogined = true;
                break;
            } else {
                System.out.println("Error");
            }
        }

        System.out.println("Hi!");
        if (isLogined) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are u?");
        }

    }
}

// public class array {
// public static void main(String[] args) {
// String[] users = { "inmo", "yeezin", "yeeun" };
// String inputId = args[0];

// boolean isLogined = false;
// for (int i = 0; i < users.length; i++) {
// String currentId = users[i];
// if (currentId.equals(inputId)) {
// isLogined = true;
// break;
// } else {
// System.out.println("Error");
// }
// }

// System.out.println("Hi!!");
// if (isLogined) {
// System.out.println("Master!");
// } else {
// System.out.println("Who are you?");
// }

// }
// }
