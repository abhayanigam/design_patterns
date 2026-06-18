package behavioral_patterns.strategy_design_pattern;

// 1. THE STRATEGY INTERFACE
// ==========================================
// This defines what operations a user role must manage.
interface RolePermissionStrategy {
    boolean canCreate();
    boolean canEdit();
    boolean canDelete();
    String getRoleName();
}