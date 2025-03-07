package ch.brix.gql.client.frontify.builders;

public class On_FolderItems extends ch.brix.gql.client.TypeBuilder {
  public On_FolderItems() {
    super(new ch.brix.gql.client.On("FolderItems"));
  }
  /**
   * Total amount of results.
   */
  public On_FolderItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_FolderItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_FolderItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_FolderItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `Folder`
   */
  public On_FolderItems items(FolderItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
