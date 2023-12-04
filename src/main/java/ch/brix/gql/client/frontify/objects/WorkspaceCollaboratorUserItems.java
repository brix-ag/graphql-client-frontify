package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkspaceCollaboratorUserItems {
  /**
   * Total amount of results.
   */
  @com.google.gson.annotations.SerializedName("total")
  private ch.brix.gql.client.frontify.scalars.IntScalar total;
  /**
   * Current page number.
   */
  @com.google.gson.annotations.SerializedName("page")
  private ch.brix.gql.client.frontify.scalars.IntScalar page;
  /**
   * Number of results per page.
   */
  @com.google.gson.annotations.SerializedName("limit")
  private ch.brix.gql.client.frontify.scalars.IntScalar limit;
  /**
   * Indicates if a next page is available or not
   */
  @com.google.gson.annotations.SerializedName("hasNextPage")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar hasNextPage;
  /**
   * List of `User` items that have lowest required permissions to collaborate on a `Workspace`.
   */
  @com.google.gson.annotations.SerializedName("items")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.User.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.User> items;
  /**
   * **BETA** List of `WorkspaceProjectCollaboratorUserEdgeType` edges.
   */
  @com.google.gson.annotations.SerializedName("edges")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.WorkspaceProjectCollaboratorUserEdge.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.WorkspaceProjectCollaboratorUserEdge> edges;
}
