package behavioral_patterns.strategy_design_pattern;

// 2. CONCRETE ROLE STRATEGIES
// ==========================================
class AdminRole implements RolePermissionStrategy {
    @Override public boolean canCreate() { return true; }
    @Override public boolean canEdit() { return true; }
    @Override public boolean canDelete() { return true; }
    @Override public String getRoleName() { return "ADMIN"; }
}