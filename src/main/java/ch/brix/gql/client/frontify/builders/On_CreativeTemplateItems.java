package ch.brix.gql.client.frontify.builders;

public class On_CreativeTemplateItems extends ch.brix.gql.client.TypeBuilder {
  public On_CreativeTemplateItems() {
    super(new ch.brix.gql.client.On("CreativeTemplateItems"));
  }
  /**
   * Total amount of results.
   */
  public On_CreativeTemplateItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_CreativeTemplateItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_CreativeTemplateItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_CreativeTemplateItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** List of type `CreativeTemplate`
   */
  public On_CreativeTemplateItems items(CreativeTemplateItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
