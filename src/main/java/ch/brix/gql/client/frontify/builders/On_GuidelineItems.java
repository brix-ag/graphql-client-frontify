package ch.brix.gql.client.frontify.builders;

public class On_GuidelineItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineItems() {
    super(new ch.brix.gql.client.On("GuidelineItems"));
  }
  /**
   * Total amount of results.
   */
  public On_GuidelineItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelineItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelineItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelineItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `Guideline` type projects.
   */
  public On_GuidelineItems items(GuidelineItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
