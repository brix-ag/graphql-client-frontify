package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageSectionElementItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageSectionElementItems() {
    super(new ch.brix.gql.client.On("GuidelinePageSectionElementItems"));
  }
  /**
   * Total amount of results.
   */
  public On_GuidelinePageSectionElementItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelinePageSectionElementItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelinePageSectionElementItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelinePageSectionElementItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** `GuidelinePageSectionElementUnion` items list.
   */
  public On_GuidelinePageSectionElementItems items(GuidelinePageSectionElementItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
