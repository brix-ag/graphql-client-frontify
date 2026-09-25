package ch.brix.gql.client.frontify.builders;

public class On_WorkflowStatusTaskItems extends ch.brix.gql.client.TypeBuilder {
  public On_WorkflowStatusTaskItems() {
    super(new ch.brix.gql.client.On("WorkflowStatusTaskItems"));
  }
  /**
   * Total amount of results.
   */
  public On_WorkflowStatusTaskItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_WorkflowStatusTaskItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_WorkflowStatusTaskItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_WorkflowStatusTaskItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `WorkflowTask`.
   */
  public On_WorkflowStatusTaskItems items(WorkflowStatusTaskItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
