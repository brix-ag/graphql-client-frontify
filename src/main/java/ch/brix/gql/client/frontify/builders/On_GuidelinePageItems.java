package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageItems() {
    super(new ch.brix.gql.client.On("GuidelinePageItems"));
  }
  /**
   * Total amount of results.
   */
  public On_GuidelinePageItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelinePageItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelinePageItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelinePageItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** List of `GuidelinePage` items.
   */
  public On_GuidelinePageItems items(GuidelinePageItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
