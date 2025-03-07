package ch.brix.gql.client.frontify.builders;

public class On_WorkspaceItems extends ch.brix.gql.client.TypeBuilder {
  public On_WorkspaceItems() {
    super(new ch.brix.gql.client.On("WorkspaceItems"));
  }
  /**
   * Total amount of results.
   */
  public On_WorkspaceItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_WorkspaceItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_WorkspaceItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_WorkspaceItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `Workspace`.
   */
  public On_WorkspaceItems items(WorkspaceItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
