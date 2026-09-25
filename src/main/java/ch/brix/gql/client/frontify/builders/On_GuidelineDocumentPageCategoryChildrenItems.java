package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentPageCategoryChildrenItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentPageCategoryChildrenItems() {
    super(new ch.brix.gql.client.On("GuidelineDocumentPageCategoryChildrenItems"));
  }
  /**
   * **BETA** The paginated list of `GuidelineDocumentPageCategory` children navigation items.
   */
  public On_GuidelineDocumentPageCategoryChildrenItems items(GuidelineDocumentPageCategoryChildrenItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Total amount of results.
   */
  public On_GuidelineDocumentPageCategoryChildrenItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelineDocumentPageCategoryChildrenItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelineDocumentPageCategoryChildrenItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelineDocumentPageCategoryChildrenItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
}
