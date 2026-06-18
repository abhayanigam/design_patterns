package behavioral_patterns.strategy_design_pattern;

// 2. CONCRETE ROLE STRATEGIES
// ==========================================
class GuestRole implements RolePermissionStrategy {
    @Override public boolean canCreate() { return false; }
    @Override public boolean canEdit() { return false; }
    @Override public boolean canDelete() { return false; }
    @Override public String getRoleName() { return "GUEST"; }
}