package ch.brix.gql.client.frontify.builders;

public class On_LibraryPageCollection extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryPageCollection() {
    super(new ch.brix.gql.client.On("LibraryPageCollection"));
  }
  /**
   * `Collection` Id.
   */
  public On_LibraryPageCollection id() {
    _add_field("id");
    return this;
  }
  /**
   * `Collection` name.
   */
  public On_LibraryPageCollection name() {
    _add_field("name");
    return this;
  }
  /**
   * `LibraryPageCollection`'s `Asset` items list.
   */
  public On_LibraryPageCollection assets(LibraryPageCollection_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `LibraryPageCollection`'s privacy state setting.
   */
  public On_LibraryPageCollection isPrivate() {
    _add_field("isPrivate");
    return this;
  }
}
