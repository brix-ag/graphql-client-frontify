package ch.brix.gql.client.frontify.builders;

public class On_GuidelineNavigationItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineNavigationItems() {
    super(new ch.brix.gql.client.On("GuidelineNavigationItems"));
  }
  /**
   * **BETA** The paginated list of `Guideline` navigation items.
   */
  public On_GuidelineNavigationItems items(GuidelineNavigationItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Total amount of results.
   */
  public On_GuidelineNavigationItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelineNavigationItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelineNavigationItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelineNavigationItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
}
