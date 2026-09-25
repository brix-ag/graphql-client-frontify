package ch.brix.gql.client.frontify.builders;

public class On_WorkspaceCollaboratorUserItems extends ch.brix.gql.client.TypeBuilder {
  public On_WorkspaceCollaboratorUserItems() {
    super(new ch.brix.gql.client.On("WorkspaceCollaboratorUserItems"));
  }
  /**
   * Total amount of results.
   */
  public On_WorkspaceCollaboratorUserItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_WorkspaceCollaboratorUserItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_WorkspaceCollaboratorUserItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_WorkspaceCollaboratorUserItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `User` items that have lowest required permissions to collaborate on a `Workspace`.
   */
  public On_WorkspaceCollaboratorUserItems items(WorkspaceCollaboratorUserItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** List of `WorkspaceProjectCollaboratorUserEdgeType` edges.
   */
  public On_WorkspaceCollaboratorUserItems edges(WorkspaceCollaboratorUserItems_edges callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
