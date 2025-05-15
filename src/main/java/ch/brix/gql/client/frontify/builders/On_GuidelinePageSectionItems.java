package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageSectionItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageSectionItems() {
    super(new ch.brix.gql.client.On("GuidelinePageSectionItems"));
  }
  /**
   * Total amount of results.
   */
  public On_GuidelinePageSectionItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelinePageSectionItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelinePageSectionItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelinePageSectionItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** List of `GuidelinePageSection` items.
   */
  public On_GuidelinePageSectionItems items(GuidelinePageSectionItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
