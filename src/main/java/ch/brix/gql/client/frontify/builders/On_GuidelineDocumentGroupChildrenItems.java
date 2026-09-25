package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentGroupChildrenItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentGroupChildrenItems() {
    super(new ch.brix.gql.client.On("GuidelineDocumentGroupChildrenItems"));
  }
  /**
   * **BETA** The paginated list of `GuidelineDocumentGroup` children navigation items.
   */
  public On_GuidelineDocumentGroupChildrenItems items(GuidelineDocumentGroupChildrenItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Total amount of results.
   */
  public On_GuidelineDocumentGroupChildrenItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelineDocumentGroupChildrenItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelineDocumentGroupChildrenItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelineDocumentGroupChildrenItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
}
