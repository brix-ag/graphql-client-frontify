package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentChildrenItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentChildrenItems() {
    super(new ch.brix.gql.client.On("GuidelineDocumentChildrenItems"));
  }
  /**
   * **BETA** The paginated list of `GuidelineDocument` children navigation items.
   */
  public On_GuidelineDocumentChildrenItems items(GuidelineDocumentChildrenItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Total amount of results.
   */
  public On_GuidelineDocumentChildrenItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelineDocumentChildrenItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelineDocumentChildrenItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelineDocumentChildrenItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
}
