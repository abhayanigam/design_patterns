package behavioral_patterns.strategy_design_pattern;

// 3. THE CONTEXT (The User account)
// ==========================================
public class UserAccount {
    private String username;
    private RolePermissionStrategy roleStrategy; // The strategy placeholder

    public UserAccount(String username, RolePermissionStrategy defaultRole) {
        this.username = username;
        this.roleStrategy = defaultRole;
    }

    // Change the user's role/strategy dynamically at runtime (e.g., Promotion)
    public void changeRole(RolePermissionStrategy newRole) {
        System.out.println("🔄 " + username + " has been assigned the " + newRole.getRoleName() + " role.");
        this.roleStrategy = newRole;
    }

    // Business features operating directly on the active strategy
    public void deleteArticle(String articleId) {
        if (roleStrategy.canDelete()) {
            System.out.println("🗑️ SUCCESS: " + username + " successfully deleted article #\n" + articleId);
        } else {
            System.out.println("❌ ACCESS DENIED: " + username + " (" + roleStrategy.getRoleName() + ") is not allowed to delete articles.\n");
        }
    }
}
