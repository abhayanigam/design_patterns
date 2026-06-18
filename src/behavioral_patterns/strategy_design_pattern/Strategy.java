package behavioral_patterns.strategy_design_pattern;

public class Strategy {
    public static void strategyExample() {

        // 1. Create a basic guest account
        UserAccount user = new UserAccount("Alice", new GuestRole());

        // Try to delete a post as a guest
        user.deleteArticle("101\n");

        System.out.println();

        // 2. Dynamically promote the user to a Moderator
        user.changeRole(new ModeratorRole());
        user.deleteArticle("101\n"); // Still denied! Moderators can't delete.

        System.out.println();

        // 3. Dynamically promote the user to an Admin
        user.changeRole(new AdminRole());
        user.deleteArticle("101\n"); // Success!
    }
}

/*
    Strategy
        Enables selecting an algorithm at runtime instead of implementing it directly.

        When to use:
            When you have multiple ways to perform an action (e.g., payment methods, sorting algorithms,
            or car allocation routing) and want to swap the behavior dynamically.

        The Scenario: A Content Management System (CMS)
            1. Imagine a blog platform where users can interact with articles.
            2. Admin: Can create, edit, and delete any article.
            3. Moderator: Can edit articles to fix typos but cannot delete them.
            4. Customer / Guest: Can only view articles.

 */