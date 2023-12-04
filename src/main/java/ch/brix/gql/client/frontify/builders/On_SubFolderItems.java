package ch.brix.gql.client.frontify.builders;

public class On_SubFolderItems extends ch.brix.gql.client.TypeBuilder {
  public On_SubFolderItems() {
    super(new ch.brix.gql.client.On("SubFolderItems"));
  }
  /**
   * Total amount of results.
   */
  public On_SubFolderItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_SubFolderItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_SubFolderItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_SubFolderItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `SubFolder`
   */
  public On_SubFolderItems items(SubFolderItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
