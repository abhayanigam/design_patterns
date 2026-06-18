package behavioral_patterns.strategy_design_pattern;

// 2. CONCRETE ROLE STRATEGIES
// ==========================================
class ModeratorRole implements RolePermissionStrategy {
    @Override public boolean canCreate() { return false; }
    @Override public boolean canEdit() { return true; } // Can edit to fix issues
    @Override public boolean canDelete() { return false; }
    @Override public String getRoleName() { return "MODERATOR"; }
}