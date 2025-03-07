package ch.brix.gql.client.frontify.builders;

public class On_WorkflowChecklistItems extends ch.brix.gql.client.TypeBuilder {
  public On_WorkflowChecklistItems() {
    super(new ch.brix.gql.client.On("WorkflowChecklistItems"));
  }
  /**
   * Total amount of results.
   */
  public On_WorkflowChecklistItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_WorkflowChecklistItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_WorkflowChecklistItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_WorkflowChecklistItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `WorkflowChecklistItem`.
   */
  public On_WorkflowChecklistItems items(WorkflowChecklistItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
