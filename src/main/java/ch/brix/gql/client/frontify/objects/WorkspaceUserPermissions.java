package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkspaceUserPermissions {
  /**
   * Check if current `User` has `Asset` creation permissions in a specific `Workspace`.
   */
  @com.google.gson.annotations.SerializedName("canCreateAssets")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canCreateAssets;
  /**
   * Check if current `User` has `Collaborator` view permissions in a specific `Workspace`.
   */
  @com.google.gson.annotations.SerializedName("canViewCollaborators")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canViewCollaborators;
}
