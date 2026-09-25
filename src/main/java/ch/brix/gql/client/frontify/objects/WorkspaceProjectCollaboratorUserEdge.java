package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkspaceProjectCollaboratorUserEdge {
  /**
   * `User` that has the least required permissions to collaborate on a `WorkspaceProject`.
   */
  @com.google.gson.annotations.SerializedName("node")
  private ch.brix.gql.client.frontify.interfaces.User node;
  /**
   * `User` role in the `WorkspaceProject`.
   */
  @com.google.gson.annotations.SerializedName("role")
  private ch.brix.gql.client.frontify.scalars.StringScalar role;
}
