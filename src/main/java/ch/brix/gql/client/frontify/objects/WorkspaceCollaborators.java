package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkspaceCollaborators {
  /**
   * `WorkspaceCollaboratorUserItems` list.
   */
  @com.google.gson.annotations.SerializedName("users")
  private ch.brix.gql.client.frontify.objects.WorkspaceCollaboratorUserItems users;
}
