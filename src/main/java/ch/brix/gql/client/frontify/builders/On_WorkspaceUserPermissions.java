package ch.brix.gql.client.frontify.builders;

public class On_WorkspaceUserPermissions extends ch.brix.gql.client.TypeBuilder {
  public On_WorkspaceUserPermissions() {
    super(new ch.brix.gql.client.On("WorkspaceUserPermissions"));
  }
  /**
   * Check if current `User` has `Asset` creation permissions in a specific `Workspace`.
   */
  public On_WorkspaceUserPermissions canCreateAssets() {
    _add_field("canCreateAssets");
    return this;
  }
  /**
   * Check if current `User` has `Collaborator` view permissions in a specific `Workspace`.
   */
  public On_WorkspaceUserPermissions canViewCollaborators() {
    _add_field("canViewCollaborators");
    return this;
  }
}
