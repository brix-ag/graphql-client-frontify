package ch.brix.gql.client.frontify.builders;

public class On_LibraryPage extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryPage() {
    super(new ch.brix.gql.client.On("LibraryPage"));
  }
  /**
   * `LibraryPage` Id.
   */
  public On_LibraryPage id() {
    _add_field("id");
    return this;
  }
  /**
   * `LibraryPage` title.
   */
  public On_LibraryPage title() {
    _add_field("title");
    return this;
  }
  /**
   * `LibraryPage` type.
   */
  public On_LibraryPage type() {
    _add_field("type");
    return this;
  }
  /**
   * **BETA** `LibraryPage` `Collection` items list.
   */
  public On_LibraryPage collections(LibraryPage_collections callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `LibraryPage` `Asset` items list.
   */
  public On_LibraryPage assets(LibraryPage_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
